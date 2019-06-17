package no.patari.codeisdark.slides.dsl.models

class QuoteBuilder(
    var text: String?,
    var author: String? = null
) {
    fun build() = Quote(text, author)
}

class BulletsBuilder(
    var stepped: Boolean,
    var items: List<Bullet>
) {
    fun build() = Bullets(stepped, items)
}

class BulletBuilder(
    var stepped: Boolean,
    var text: String,
    var items: List<Bullet>
) {
    fun build() = Bullet(stepped, text, items)
}

class DocumentBuilder(
    var file: String? = null,
    var fragment: String? = null
) {
    fun build() = Document(file, fragment)
}

class CodeBuilder(
    var text: String? = null,
    var document: Document? = null
) {
    fun document(setup: DocumentBuilder.() -> Unit = {}) = DocumentBuilder().also(setup).let {
        document = it.build()
    }

    fun build() = ParagraphContent.Code(text, document)
}

class MathBuilder(
    var text: String? = null,
    var document: Document? = null
) {

    fun document(setup: DocumentBuilder.() -> Unit = {}) = DocumentBuilder().also(setup).let {
        document = it.build()
    }

    fun build() = ParagraphContent.Math(text, document)
}

class CommentBuilder(
    var stepped: Boolean = true,
    var image: String? = null,
    var text: String? = null
) {
    fun build() = ParagraphContent.Comment(stepped, image, text)
}

class TextBuilder(
    var text: String
) {
    fun build() = ParagraphContent.Text(text)

}

class ImageBuilder(
    var stepped: Boolean = true,
    var image: String
) {
    fun build(): ParagraphContent? = ParagraphContent.Image(stepped, image)
}

class ParagraphBuilder(
    var content: ParagraphContent?
) {

    fun code(text: String? = null, document: Document? = null, setup: CodeBuilder.() -> Unit = {}) =
        CodeBuilder(text, document).also(setup).let {
            content = it.build()
        }

    fun math(text: String? = null, document: Document? = null, setup: MathBuilder.() -> Unit = {}) =
        MathBuilder(text, document).also(setup).let {
            content = it.build()
        }

    fun text(text: String, setup: TextBuilder.() -> Unit = {}) =
        TextBuilder(text).also(setup).let {
            content = it.build()
        }

    fun comment(
        stepped: Boolean = true,
        image: String? = null,
        text: String? = null,
        setup: CommentBuilder.() -> Unit = {}
    ) =
        CommentBuilder(stepped, image, text).also(setup).let {
            content = it.build()
        }

    fun image(stepped: Boolean = true, value: String, setup: ImageBuilder.() -> Unit = {}) =
        ImageBuilder(stepped, value).also(setup).let {
            content = it.build()
        }

    fun build() = Paragraph(content)

}

class BackgroundBuilder(
    var image: String? = null,
    var color: String? = null
) {

    fun build() = Background(image, color)

}

class SlideBuilder(
    var title: String? = null,
    var subtitle: String? = null,
    var quote: Quote? = null,
    var bullets: Bullets? = null,
    var background: Background? = null,
    var classes: MutableList<Class> = mutableListOf()
) {

    private var paragraphs = mutableListOf<Paragraph>()

    fun p(
        content: ParagraphContent? = null,
        setup: ParagraphBuilder.() -> Unit = {}
    ) = ParagraphBuilder(content).also(setup).let {
        paragraphs.plusAssign(it.build())
    }

    fun quote(text: String? = null, author: String? = null, setup: QuoteBuilder.() -> Unit = {}) =
        QuoteBuilder(text, author).also(setup).let {
            quote = it.build()
        }

    fun bullets(
        stepped: Boolean = false,
        items: List<Bullet> = mutableListOf(),
        setup: BulletsBuilder.() -> Unit = {}
    ) = BulletsBuilder(stepped, items).also(setup).let {
        bullets = it.build()
    }

    fun background(image: String? = null, color: String? = null, setup: BackgroundBuilder.() -> Unit = {}) =
        BackgroundBuilder(image, color).also(setup).let {
            background = it.build()
        }

    fun build() = Slide(
        title = title,
        subtitle = subtitle,
        paragraphs = paragraphs.toList(),
        classes = classes.toList(),
        quote = quote,
        bullets = bullets,
        background = background
    )
}

class SlidesBuilder {

    private var slides = mutableListOf<Slide>()

    fun slide(
        vararg classes: Class,
        setup: SlideBuilder.() -> Unit = {}
    ) = SlideBuilder(classes = classes.toMutableList()).also(setup).let {
        slides.plusAssign(it.build())
    }

    fun build() = Slides(slides.toList())
}

fun slides(setup: SlidesBuilder.() -> Unit = {}): Slides = SlidesBuilder().also(setup).build()
