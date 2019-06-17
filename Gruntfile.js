/* global module:false */
module.exports = function (grunt) {
    var port = grunt.option('port') || 8000;
    var root = grunt.option('root') || '.';

    if (!Array.isArray(root)) root = [root];

    // Project configuration
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        meta: {
            banner:
                '/*!\n' +
                ' * reveal.js <%= pkg.version %> (<%= grunt.template.today("yyyy-mm-dd, HH:MM") %>)\n' +
                ' * http://revealjs.com\n' +
                ' * MIT licensed\n' +
                ' *\n' +
                ' * Copyright (C) 2018 Hakim El Hattab, http://hakim.se\n' +
                ' */'
        },

        qunit: {
            files: ['test/*.html']
        },

        uglify: {
            options: {
                banner: '<%= meta.banner %>\n',
                ie8: true
            },
            build: {
                src: 'slides/js/reveal.js',
                dest: 'slides/js/reveal.min.js'
            }
        },

        sass: {
            core: {
                src: 'slides/css/reveal.scss',
                dest: 'slides/css/reveal.css'
            },
            themes: {
                expand: true,
                cwd: 'slides/css/theme/source',
                src: ['*.sass', '*.scss'],
                dest: 'slides/css/theme',
                ext: '.css'
            }
        },

        autoprefixer: {
            core: {
                src: 'slides/css/reveal.css'
            }
        },

        cssmin: {
            options: {
                compatibility: 'ie9'
            },
            compress: {
                src: 'slides/css/reveal.css',
                dest: 'slides/css/reveal.min.css'
            }
        },

        jshint: {
            options: {
                curly: false,
                eqeqeq: true,
                immed: true,
                esnext: true,
                latedef: 'nofunc',
                newcap: true,
                noarg: true,
                sub: true,
                undef: true,
                eqnull: true,
                browser: true,
                expr: true,
                loopfunc: true,
                globals: {
                    head: false,
                    module: false,
                    console: false,
                    unescape: false,
                    define: false,
                    exports: false
                }
            },
            files: ['Gruntfile.js', 'slides/js/reveal.js']
        },

        connect: {
            server: {
                options: {
                    port: port,
                    base: root,
                    livereload: true,
                    open: true,
                    useAvailablePort: true
                }
            }
        },

        zip: {
            bundle: {
                src: [
                    'index.html',
                    'slides/css/**',
                    'slides/js/**',
                    'slides/images/**',
                    'slides/plugin/**',
                    '**.md'
                ],
                dest: 'slides/reveal-js-presentation.zip'
            }
        },

        watch: {
            js: {
                files: ['Gruntfile.js', 'slides/js/reveal.js'],
                tasks: 'js'
            },
            theme: {
                files: [
                    'slides/css/theme/source/*.sass',
                    'slides/css/theme/source/*.scss',
                    'slides/css/theme/template/*.sass',
                    'slides/css/theme/template/*.scss'
                ],
                tasks: 'css-themes'
            },
            css: {
                files: ['slides/css/reveal.scss'],
                tasks: 'css-core'
            },
            html: {
                files: root.map(function (path) {
                    return path + '/*.html';
                })
            },
            markdown: {
                files: root.map(function (path) {
                    return path + '/*.md';
                })
            },
            options: {
                livereload: true
            }
        },

        retire: {
            js: ['js/reveal.js', 'lib/js/*.js', 'plugin/**/*.js'],
            node: ['.']
        }

    });

    // Dependencies
    grunt.loadNpmTasks('grunt-contrib-connect');
    grunt.loadNpmTasks('grunt-contrib-cssmin');
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-qunit');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-autoprefixer');
    grunt.loadNpmTasks('grunt-retire');
    grunt.loadNpmTasks('grunt-sass');
    grunt.loadNpmTasks('grunt-zip');

    // Default task
    grunt.registerTask('default', ['css', 'js']);

    // JS task
    grunt.registerTask('js', ['jshint', 'uglify', 'qunit']);

    // Theme CSS
    grunt.registerTask('css-themes', ['sass:themes']);

    // Core framework CSS
    grunt.registerTask('css-core', ['sass:core', 'autoprefixer', 'cssmin']);

    // All CSS
    grunt.registerTask('css', ['sass', 'autoprefixer', 'cssmin']);

    // Package presentation to archive
    grunt.registerTask('package', ['default', 'zip']);

    // Serve presentation locally
    grunt.registerTask('serve', ['connect', 'watch']);

    // Run tests
    grunt.registerTask('test', ['jshint', 'qunit']);

};
