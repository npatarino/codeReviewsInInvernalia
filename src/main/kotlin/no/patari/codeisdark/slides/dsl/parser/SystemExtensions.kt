package no.patari.codeisdark.slides.dsl.parser

import no.patari.codeisdark.slides.dsl.models.SlidesBuilder
import java.io.File

fun String.fromResources() = SlidesBuilder().javaClass.classLoader.getResource(this).file.let {
    File(it).readText()
}
