package no.patari.codeisdark.slides.dsl

import no.patari.codeisdark.slides.dsl.models.SlideBuilder
import no.patari.codeisdark.slides.dsl.parser.toHtml
import no.patari.codeisdark.slides.generation.intro
import java.io.File
import java.text.MessageFormat

fun main() {

    val htmlBasefile: String = SlideBuilder().javaClass.classLoader.getResource("base.html").file
    val scriptFile: String = SlideBuilder().javaClass.classLoader.getResource("script.js").file

    val htmlBase = File(htmlBasefile).readText()
    val script = File(scriptFile).readText()

    val messageFormat = MessageFormat(htmlBase)

    val content: String = intro().toHtml()

    val textArgs = arrayOf<Any>(content, script)

    File("index.html").writeText(messageFormat.format(textArgs))

}