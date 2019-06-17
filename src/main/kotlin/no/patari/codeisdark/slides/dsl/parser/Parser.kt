package no.patari.codeisdark.slides.dsl.parser

import no.patari.codeisdark.slides.dsl.models.*
import no.patari.codeisdark.slides.dsl.regex.fix
import no.patari.codeisdark.slides.dsl.regex.fragment

fun Slides.toHtml(): String {
    val stringBuilder = StringBuilder()

    slides.map { slide ->

        val backgroundImage = slide.backgroundTag()
        val classes = slide.cssClassesTag()

        val title = slide.titleTag().fix()
        val subtitle = slide.subtitleTag().fix()
        val quote = slide.quoteTag().fix()
        val paragraphs = slide.paragraphsTag()
        val bullets = slide.bulletsTag()

        stringBuilder.append("\n<section $backgroundImage $classes>")
        stringBuilder.append(title)
        stringBuilder.append(subtitle)
        stringBuilder.append(quote)
        stringBuilder.append(paragraphs)
        stringBuilder.append(bullets)

        stringBuilder.append("\n</section>")
    }

    return stringBuilder.toString()
}

private fun Slide.paragraphsTag(): String = takeIf { paragraphs.isNotEmpty() }?.let {
    paragraphs.map {
        it.paragraphTag()
    }.reduce { previous, paragraph -> "$previous\n$paragraph" }
} ?: ""

private fun Paragraph.paragraphTag(): String = when (content) {
    is ParagraphContent.Text -> content.text.tag("p").fix()
    is ParagraphContent.Math -> content.text.wrap("\\[\\begin{aligned}\n", " \\\\\n\\end{aligned} \\]\n").tag("p")
    is ParagraphContent.Code -> content.document?.let { doc ->
        doc.fragment?.let { f ->
            doc.file?.snippet(f).wrap(
                "<code data-trim class=\"CodeMirror arrow\" data-executable=\"false\">\n",
                "\n</code>\n"
            )
        } ?: ""
    } ?: content.text.wrap(
        "<code data-trim class=\"CodeMirror arrow\" data-executable=\"false\">\n",
        "\n</code>\n"
    )
    is ParagraphContent.Comment -> (content.image?.let {
        "<img src=\"slides/images/$it\" class=\"comment-image\" />"
    } ?: "").plus(
        content.text
            ?.tag("div", "comment-text")
    )
        .tag("div", "comment-wrapper")
        .tag("div", "${if (content.stepped) "fragment" else ""} comment")
    is ParagraphContent.Image -> content.value.let {
        "<img src=\"slides/images/$it\" class=\"${ if(content.stepped) "fragment" else "" } \" />"
    }
    null -> ""
}

fun String.snippet(fragment: String) = "snippets/$this".fromResources().fragment(fragment)

fun Slide.titleTag() = title.tag("h1")

fun Slide.subtitleTag() = subtitle.tag("h2")

fun Slide.quoteTag(): String = quote?.let {
    val author = it.author?.tag("em") ?: ""
    "${it.text}$author".tag("blockquote")
} ?: ""

fun Slide.bulletsTag(): String = bullets?.items?.joinToString(separator = "") { it.tag() }?.tag("ul") ?: ""

fun Bullet.tag(): String =
    "<li ${if (stepped) " class=\"fragment\"" else ""}  >${text} ${if (subItems.isNotEmpty()) subItems.joinToString(
        separator = ""
    ) { bullet: Bullet -> bullet.tag() }.tag("ul") else ""}</li>"

fun String?.tag(tag: String, clazz: String? = null) = takeIf { !this.isNullOrBlank() }?.let {
    "\n<$tag class=\"$clazz\">$this</$tag>"
} ?: ""

fun String?.wrap(begin: String, end: String) = takeIf { !this.isNullOrBlank() }?.let {
    "\n$begin$this$end"
} ?: ""

fun String?.property(property: String, value: String) =
    takeIf { !this.isNullOrBlank() }?.let { "$property=\"$value\"" } ?: ""

private fun Slide.backgroundTag(): String = background?.let {
    with(background.image) {
        property("data-background-image", "slides/images/$this")
    }
} ?: ""

fun Slide.cssClassesTag(): String = with(classes.joinToString(separator = " ") { it.value }) {
    property("data-state", this)
}