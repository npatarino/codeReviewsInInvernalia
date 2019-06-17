package no.patari.codeisdark.slides.dsl.regex

import java.util.regex.Pattern

fun String.fix(): String = emphasis.toRegex().find(this)?.let { results ->

    takeIf { results.groups.count() == 3 }?.let {
        val match = results.groups[0]?.value
        val character = results.groups[1]?.value
        val tag = character?.htmlTag()
        val word = results.groups[2]?.value

        match?.let {
            tag?.let {
                word?.let {
                    replace(match, "<$tag>$word</$tag>")
                }
            }
        }
    }
} ?: this

fun String.fragment(fragment: String) = fragmentPattern(fragment).toRegex().find(this)?.let {
    it.groupValues[0].replace(">", "&gt;").replace("<", "&lt;")
} ?: ""

private fun String.htmlTag(): String = when (this) {
    "_" -> "i"
    "*" -> "b"
    else -> ""
}

private val emphasis: Pattern = Pattern.compile("([*_*])(.*?)\\1")

private fun fragmentPattern(fragment: String): Pattern =
    Pattern.compile("(?<=(// $fragment\\n))(.|\\n)*?(?=(// $fragment))")