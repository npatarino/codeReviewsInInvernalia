Reveal.initialize({
    controls: false,
    // The "normal" size of the presentation, aspect ratio will be preserved
    // when the presentation is scaled to fit different resolutions. Can be
    // specified using percentage units.
    width: '85%',
    height: '100%',

    // Factor of the display size that should remain empty around the content
    margin: 0.1,
    // Bounds for smallest/largest possible scale to apply to content
    minScale: 0.2,
    maxScale: 1.5,
    transition: 'slide',
    backgroundTransition: 'slide',
    touch: true,
    progress: true,
    history: true,
    viewDistance: 3,
    // center: false,
    slideNumber: 'c/t',
    dependencies: [
        {src: 'slides/plugin/markdown/marked.js'},
        {src: 'slides/plugin/markdown/markdown.js'},
        {src: 'slides/plugin/notes/notes.js', async: true},
        {src: 'slides/plugin/menu/menu.js'},
        {src: 'slides/plugin/math/math.js', async: true}
    ]
});
Reveal.addEventListener('ready', function (event) {
    var AP = ArrowPlayground('.arrow');
    AP.then(function run(value) {
        window.PlaygroundSnippets = value;
    });
});
Reveal.addEventListener('slidechanged', function (event) {
    var currentSlide = document.querySelector(".present");
    PlaygroundSnippets.map(function run(arrowSnippet) {
        if (currentSlide.contains(arrowSnippet.targetNode)) {
            arrowSnippet.view.codemirror.refresh();
        }
    });
    window.dispatchEvent(new Event('resize'));
});
