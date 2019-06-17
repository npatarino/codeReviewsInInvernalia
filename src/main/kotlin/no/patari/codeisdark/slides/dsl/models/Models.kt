package no.patari.codeisdark.slides.dsl.models

data class Background(
    val image: String?,
    val color: String?
)

data class Slides(val slides: List<Slide>)

data class Slide(
    val classes: List<Class>,
    val title: String?,
    val subtitle: String?,
    val quote: Quote?,
    val paragraphs: List<Paragraph>,
    val bullets: Bullets?,
    val background: Background?
)

data class Paragraph(
    val content: ParagraphContent?
)

data class Document(
    val file: String?,
    val fragment: String?
)

data class Quote(
    val text: String?,
    val author: String?
)

data class Bullets(
    val stepped: Boolean = false,
    val items: List<Bullet>
)

data class Bullet(
    val stepped: Boolean = true,
    val text: String?,
    val subItems: List<Bullet> = emptyList()
)

sealed class ParagraphContent {

    data class Text(val text: String) : ParagraphContent()

    data class Math(val text: String? = null, val document: Document? = null) : ParagraphContent()

    data class Code(val text: String? = null, val document: Document? = null) : ParagraphContent()

    data class Comment(val stepped: Boolean, val image: String?, val text: String?) : ParagraphContent()

    data class Image(val stepped: Boolean, val value: String) : ParagraphContent()
}

sealed class Class(val value: String) {
    object Overlay : Class("imageable")
    object TitleBottom : Class("section-bottom")
    object WithCode : Class("with-code")
    object TitleRight : Class("middle-right")
    object TitleLeft : Class("middle-left")
    object NoBackground : Class("no-bg")
    class Custom(clazz: String) : Class(clazz)
}
