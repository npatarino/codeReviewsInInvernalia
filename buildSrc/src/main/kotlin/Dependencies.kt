object Versions {
    val coroutines = "1.1.1"
    val jUnit = "4.12"
    val kotlinTest = "3.3.2"
    val slf4jNop = "1.7.26"
}

object Dependencies {

    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Versions.coroutines}"
    val jUnit = "junit:junit:${Versions.jUnit}"
    val kotlinTest = "io.kotlintest:kotlintest-runner-junit4:${Versions.kotlinTest}"
    val slf4jNop = "org.slf4j:slf4j-nop:${Versions.slf4jNop}"
}