package no.patari.codeisdark.slides.generation

import no.patari.codeisdark.slides.dsl.models.Bullet
import no.patari.codeisdark.slides.dsl.models.Class
import no.patari.codeisdark.slides.dsl.models.Slides
import no.patari.codeisdark.slides.dsl.models.slides

fun intro(): Slides = slides {

    slide {
        background {
            image = "cover.png"
        }
    }

    slide(Class.Overlay) {
        title = "Nicolás _Patarino_"
        subtitle = "@npatarino"
        background {
            image = "buenos-aires.jpg"
        }
    }

    slide {
        title = "_Disclaimer_"
    }

    slide(Class.TitleBottom) {
        background {
            image = "targaryen-consulting.jpg"
        }
    }

    slide(Class.Overlay, Class.TitleBottom) {
        title = "_Winterfell_ project"
        background {
            image = "trees.jpg"
        }
    }

    slide(Class.TitleRight, Class.Custom("text-for-pink")) {
        title = "Peter _Baelish_"
        subtitle = "Project Manager"
        background {
            image = "baelish.jpg"
        }
    }

    slide(Class.TitleLeft, Class.Custom("text-for-salmon")) {
        title = "Ramsay _Bolton_"
        subtitle = "Quality Assurance"
        background {
            image = "ramsay.jpg"
        }
    }

    slide(Class.TitleLeft, Class.Custom("text-for-purple")) {
        title = "Walker _White_"
        subtitle = "UX / UI"
        background {
            image = "white-walker-ux.jpg"
        }
    }

    slide(Class.TitleLeft, Class.Custom("text-for-yellow")) {
        title = "Daenerys"
        subtitle = "Senior Full Stack<br/>Developer"
        background {
            image = "danny.jpg"
        }
    }

    slide(Class.TitleRight, Class.Custom("text-for-pistacho")) {
        title = "Jon _Snow_"
        subtitle = "Junior Developer"
        background {
            image = "jon.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "_Winterfell_ project"
        background {
            image = "trees.jpg"
        }
    }

    slide(Class.Overlay, Class.TitleBottom) {
        p {
            image(false, value = "story.jpg")
        }
        background {
            image = "danny-mini-dragon.jpg"
        }
    }

    slide(Class.Overlay, Class.WithCode) {
        p {
            code {
                document {
                    file = "BadCode.js"
                    fragment = "jons-code"
                }
            }
        }
    }

    slide(Class.WithCode) {
        p {
            comment {
                image = "mini-danny.jpg"
                text = "This is the worst code I've ever seen.<br/>I command you to restart te work from scratch"
            }
        }

        p {
            comment {
                image = "mini-jon.jpg"
                text = "You are an old developer that doesn't know how to create a good software without all your " +
                        "outdated shit.<br/>And you are the ugliest developer in the Seven Kingdoms"
            }
        }
    }

    slide(Class.WithCode) {
        p {
            comment {
                image = "mini-danny.jpg"
                text = "Respect me!<br/>" +
                        "I’m Daenerys Webstorm of the tech crew Targaryen, the First of" +
                        "Her Team, The Un-refactored, Queen of the Smells, the SOLID" +
                        "and the First Commit, Queen of Merge, Khaleesi of the Great" +
                        "Injector, Protector of the Realm™, Lady Regnant of the Seven" +
                        "Frameworks, Breaker of Method Chaining and Mother of Dagger"
            }
        }
    }

    slide(Class.WithCode) {
        // title = "Code Review comments"

        p {
            comment {
                image = "mini-jon.jpg"
                text = "You are still ugly"
            }
        }
    }

    slide(Class.TitleRight, Class.Custom("text-for-salmon")) {
        title = "Ygritte"
        subtitle = "Principal engineer"
        background {
            image = "ingrid.jpg"
        }
    }

    slide(Class.Overlay, Class.TitleBottom) {
        p {
            comment {
                image = "mini-ygritte.jpg"
                text = "You know nothing, Jon Snow"
            }
        }

        background {
            image = "wild.jpg"
        }
    }

    slide {
        background {
            image = "around.jpg"
        }
    }

    slide(Class.Overlay, Class.TitleBottom) {
        title = "_Agile_ Coach"
        background {
            image = "tyrion.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Let's start from the _beginning_"
        background {
            image = "begining.jpg"
        }
    }

    slide(Class.NoBackground) {
        quote {
            text = "Code review is systematic examination of computer source code"
        }
    }

    slide(Class.NoBackground) {
        title = "_Main_ goal"
        subtitle = "Increase the software quality"
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_Company_ benefits"
        p {
            bullets {
                stepped = true
                items = listOf(
                    Bullet(text = "Increase software quality"),
                    Bullet(text = "Find bugs before release"),
                    Bullet(text = "Make code maintainable"),
                    Bullet(text = "Create team foundations"),
                    Bullet(text = "Create Code Style Guidelines"),
                    Bullet(text = "...")
                )
            }
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_Career_ benefits"
        p {
            bullets {
                stepped = true
                items = listOf(
                    Bullet(text = "Learn from peers"),
                    Bullet(text = "Gain knowledge about your business"),
                    Bullet(text = "Gives you visibility in your company"),
                    Bullet(text = "Helps mentoring (mentor & mentee)"),
                    Bullet(text = "Shared responsibility"),
                    Bullet(text = "...")
                )
            }
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_Personal_ benefits"
        p {
            bullets {
                stepped = true
                items = listOf(
                    Bullet(text = "Learn the value of constructive criticism"),
                    Bullet(text = "Improves your soft skills"),
                    Bullet(text = "Makes you be better developer by (auto) pressure"),
                    Bullet(text = "Makes you more empathetic"),
                    Bullet(text = "Learn how to give feedback"),
                    Bullet(text = "...")
                )
            }
        }
    }

    slide(Class.Overlay, Class.TitleBottom) {
        title = "Types of _Code Review_"
        background {
            image = "types.jpg"
        }
    }

    slide(Class.WithCode) {
        title = "_Formal_ Code Review"
        p {
            bullets {
                stepped = true

                items = listOf(
                    Bullet(text = "Printed copies of code"),
                    Bullet(text = "Multiple participants"),
                    Bullet(text = "Multiple phases"),
                    Bullet(text = "Fagan inspection")
                )
            }
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_Lightweight_ Code Review"
        p {
            bullets {
                stepped = true
                items = listOf(
                    Bullet(text = "Pair programming"),
                    Bullet(text = "Over the shoulder"),
                    Bullet(text = "Email pass-around"),
                    Bullet(text = "Informal walkthrough"),
                    Bullet(text = "Group review"),
                    Bullet(
                        text = "Tool Assisted",
                        subItems = listOf(Bullet(text = "pastebin, gists, specific tools"))
                    )
                )
            }
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "Tool _Assisted_"

        p {
            bullets {
                stepped = true
                items = listOf(
                    Bullet(text = "Pre Commit", subItems = listOf(Bullet(text = "Social Network"))),
                    Bullet(
                        text = "Post Commit",
                        subItems = listOf(Bullet(text = "Pull Request"), Bullet(text = "Commit-by-commit"))
                    )
                )
            }
        }

    }

    slide {
        background {
            image = "upsource.jpg"
        }
    }

    slide {
        p {
            image(value = "atlassian.jpg")
            image(value = "fisheye-logo.jpg")
        }
        background {
            image = "fisheye.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Type of _reviewers_"
        background {
            image = "deaths.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Best _Friend_ Forever"
        background {
            image = "sam.jpg"
        }
    }

    slide(Class.Overlay) {
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Doesn't write comments to not offend"),
                Bullet(text = "Doesn't look very deep"),
                Bullet(text = "Just approves to unlock the ticket")
            )
        }
        background {
            image = "sam.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Citadel _Maesters_"
        background {
            image = "citadel.jpg"
        }
    }

    slide(Class.Overlay) {
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Everything need to approved by them"),
                Bullet(text = "They are the only authority for decisions")
            )
        }
        background {
            image = "citadel.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Carefree"
        background {
            image = "robert.jpg"
        }
    }

    slide(Class.Overlay) {
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Approves to avoid to look the code"),
                Bullet(text = "Approves after someone else approves"),
                Bullet(text = "Thinks Code Reviews aren't helpful"),
                Bullet(text = "Thinks Code Reviews are just a formality")
            )
        }
        background {
            image = "robert.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Son of the _incest_"
        background {
            image = "joffrey.jpg"
        }
    }

    slide(Class.Overlay) {
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Thinks he has all the truth"),
                Bullet(text = "His solutions is the best, always"),
                Bullet(text = "Any change he suggests should be done"),
                Bullet(text = "He is condescend to his peers")
            )
        }
        background {
            image = "joffrey.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "The _King's_ hand"
        background {
            image = "ned.jpg"
        }
    }

    slide(Class.Overlay) {
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Cares about software quality"),
                Bullet(text = "Knows he could learn from peers"),
                Bullet(text = "Knows his comments could help someone"),
                Bullet(text = "Respect company, code and developers")
            )
        }
        background {
            image = "ned.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "_Who_ you wanna be?"
        background {
            image = "faces.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Planification"
        background {
            image = "planification.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Commits"
        background {
            image = "samsa-joffrey.jpg"
        }
    }

    slide(Class.Overlay, Class.TitleBottom) {
        p {
            image(false, "story.jpg")
        }

        background {
            image = "danny-mini-dragon.jpg"
        }
    }

    slide(Class.NoBackground) {
        title = "Jon Snow's _commit_"
    }

    slide(Class.NoBackground) {
        p {
            code {
                document {
                    file = "commits.txt"
                    fragment = "jons-commit"
                }
            }
        }
    }

    slide(Class.NoBackground) {
        title = "Tyrion's _commit_"
    }

    slide(Class.NoBackground) {
        p {
            code {
                document {
                    file = "commits.txt"
                    fragment = "tyrions-commit"
                }
            }
        }
    }

    slide(Class.NoBackground) {
        title = "_Top commits_ Github"
    }

    slide(Class.NoBackground) {

        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "\"Initial commit\""),
                Bullet(text = "\"Update README.md\""),
                Bullet(text = "\"Dummy\""),
                Bullet(text = "\"Fix\""),
                Bullet(text = "\"Tests\""),
                Bullet(text = "\"*** empty log message ***\"")
            )
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_To-Do_ list for review"
        bullets {
            stepped = true
            items = listOf(
                Bullet(
                    true,
                    "Write a good title and description",
                    listOf(Bullet(text = "Remember good commits?"))
                ),
                Bullet(text = "Reasonable due time"),
                Bullet(text = "Do you have a Code Review template?"),
                Bullet(
                    true, "Help to review it", listOf(
                        Bullet(text = "Could you provide some screenshots?"),
                        Bullet(text = "Ask for specific feedback"),
                        Bullet(text = "Explain how to test it")
                    )
                ),
                Bullet(text = "Review your own code before to start")
            )
        }
    }

    slide(Class.Overlay) {
        title = "Choose _reviewer_"
        background {
            image = "dothraki.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "None"
        background {
            image = "desert.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Who _developer_ wants"
        background {
            image = "jon-snow.jpg"
        }
    }

    slide(Class.Overlay, Class.WithCode) {
        p {
            image(value = "no.jpg")
        }
        background {
            image = "danny-jon.jpg"
        }
    }

    slide(Class.Overlay, Class.WithCode) {
        p {
            image(value = "yes.jpg")
        }
        background {
            image = "sam-2.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Specialist"
        background {
            image = "varys.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Random"
        background {
            image = "gif-gray-worm.gif"
        }
    }

    slide(Class.Overlay) {
        title = "_Cross_-Platform"
        background {
            image = "meeting.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Review"
        background {
            image = "gif-dragons.gif"
        }
    }

    slide(Class.Overlay) {
        title = "Preparation to _review_"
        background {
            image = "viserys.jpg"
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_To-Do_ list for reviewers"
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Read the issue"),
                Bullet(
                    text = "How could you resolve it?",
                    subItems = listOf(Bullet(text = "What problems could you have?"))
                ),
                Bullet(
                    true, "Check out the code", listOf(
                        Bullet(text = "git stash"),
                        Bullet(text = "Second repo")
                    )
                ),
                Bullet(text = "And most important…")
            )
        }
    }

    slide(Class.Overlay) {
        title = "Take a _coffee_"
        background {
            image = "wine.jpg"
        }
    }

    slide(Class.Overlay, Class.WithCode) {
        title = "What _not_ to look at"
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Formatting and code style", subItems = listOf(Bullet(text = "Automation")))
            )
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "The most powerful tool we have as developers is automation"
            author = "Scott Hanselman"
        }
        background {
            image = "bran-carry.jpg"
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "Automation"
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Lint, Checkstyle, Inspectors…"),
                Bullet(text = "Tests execution"),
                Bullet(text = "Setup environments"),
                Bullet(text = "Generate versions"),
                Bullet(text = "Publish versions"),
                Bullet(
                    true, "Custom tasks", listOf(
                        Bullet(text = "i.e: Remove conversation"),
                        Bullet(text = "i.e: Login"),
                        Bullet(text = "...")
                    )
                )
            )
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "What _not_ to look at"
        bullets {
            stepped = false
            items = listOf(
                Bullet(false, "Formatting and code style", listOf(Bullet(false, text = "Automation"))),
                Bullet(text = "Further than diff", subItems = listOf(Bullet(text = "Create a technical debt")))
            )
        }
    }

    slide {
        background {
            image = "debts.jpg"
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "What _not_ to look at"

        bullets {
            stepped = false
            items = listOf(
                Bullet(false, "Formatting and code style", listOf(Bullet(false, "Automation"))),
                Bullet(
                    false,
                    "Further than diff",
                    listOf(Bullet(false, "Create a technical debt"), Bullet(text = "Don't force the Boyscout rule"))
                ),
                Bullet(
                    true, "Word by word", listOf(Bullet(text = "Everyone has their own taste about code"))
                )
            )
        }
    }

    slide(Class.Overlay) {
        title = "Don't be a _nazi_"
        background {
            image = "cersei.jpg"
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "What to _look_ at"

        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "What's important to your team?"),
                Bullet(text = "What's important to your company?"),
                Bullet(
                    true, "How it solves the problem", listOf(
                        Bullet(text = "Aha! Effect")
                    )
                ),
                Bullet(text = "Tests"),
                Bullet(text = "Usability Code")
            )
        }
    }

    slide(Class.Overlay) {
        title = "_Usability_ code"
        background {
            image = "gif-valirion-fire.gif"
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_Usabilitiy_ code"

        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Extensible"),
                Bullet(text = "Mantenible"),
                Bullet(text = "Understandable")
            )
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_Usabilitiy_ code"

        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "High Cohesion"),
                Bullet(text = "Low Coupling")
            )
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "What to _looking_ for"

        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Design Patterns"),
                Bullet(text = "Abstractions"),
                Bullet(text = "Good data structures"),
                Bullet(text = "Reuse warning"),
                Bullet(text = "SOLID"),
                Bullet(text = "Agreements (modifiable)"),
                Bullet(text = "..."),
                Bullet(text = "Visual Review")
            )
        }
    }

    slide(Class.Overlay) {
        title = "_Visual_ review"
        background {
            image = "blind.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Commenting"
        background {
            image = "letter.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Hate the code. _Love the coder_"
        background {
            image = "lannister.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "_Aristotle_ Project"
        background {
            image = "aristotle.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "The whole is greater than the sum of its parts"
            author = "Aristotle"
        }
        background {
            image = "aristotle.jpg"
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_Aristotle_ Project"

        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Confidence"),
                Bullet(text = "Structure and clarity"),
                Bullet(text = "Meaning of work"),
                Bullet(text = "Impact of work"),
                Bullet(text = "Psychological safety")
            )
        }
    }

    slide(Class.Overlay) {
        title = "Psychology Safety"
        background {
            image = "theon.jpg"
        }
    }

    slide(Class.Overlay, Class.TitleBottom) {
        quote {
            text = "A sense of confidence that the team will not embarrass, reject or punish someone for speaking up"
            author = "Amy Edmonson"
        }
        background {
            image = "theon.jpg"
        }
    }

    slide(Class.NoBackground, Class.WithCode) {
        title = "_Aristotle_ Project"

        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Collective Intelligence != Σ(Individual Intelligence)"),
                Bullet(text = "∀(team member) ≈ participation ⇒ Collective Intelligence ↑"),
                Bullet(text = "∀(team member) Social Awareness ↑ ⇒ Collective Intelligence ↑")
            )
        }
    }

    slide(Class.Overlay) {
        title = "Empathy"
        background {
            image = "shame.jpg"
        }
    }

    slide(Class.NoBackground) {
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "See the world as others see it"),
                Bullet(text = "Nonjudgmental"),
                Bullet(text = "Understand another person’s feelings"),
                Bullet(text = "Communicate your understanding of that person’s feelings back to them")
            )
        }
    }

    slide(Class.Overlay) {
        title = "Humour"
        background {
            image = "missandei.jpg"
        }
    }

    slide(Class.NoBackground) {
        p {
            comment(stepped = false) {
                image = "mini-danny.jpg"
                text =
                    "I think this could be done with FP instead of RxJava<br/>What do you think about to remove the Observable?"
            }
        }

        p {
            image(value = "git-fire.gif")
        }
    }

    slide(Class.NoBackground) {
        p {
            comment(stepped = false) {
                image = "mini-jon.jpg"
                text = "With this you get the Jenkins blue ball back in the release branch"
            }
        }

        p {
            image(value = "gif-kiss.gif")
        }
    }

    slide(Class.NoBackground) {
        p {
            comment(stepped = false) {
                image = "mini-danny.jpg"
                text = "Don't forget to do this to the WebRTC library"
            }
        }

        p {
            image(value = "gif-out.gif")
        }
    }

    slide(Class.NoBackground) {
        p {
            comment(stepped = false) {
                image = "mini-bronn.jpg"
                text = "Have you used a color salmon-pink-light-3 where it was clear we need a salmon-pink-light-4?"
            }
        }

        p {
            image(value = "gif-hit.gif")
        }
    }

    slide(Class.Overlay) {
        title = "Emojis"
        background {
            image = "spiral.jpg"
        }
    }

    slide(Class.NoBackground) {
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "\uD83E\uDD14 Question"),
                Bullet(text = "☝️ Request"),
                Bullet(text = "\uD83C\uDFA8️ Flattery"),
                Bullet(text = "\uD83D\uDC1B Bug"),
                Bullet(text = "\uD83D\uDEA7 Work in progress"),
                Bullet(text = "\uD83D\uDCA9 Need work"),
                Bullet(text = "\uD83D\uDCA1 Propose change"),
                Bullet(text = "\uD83D\uDD27 Requires action"),
                Bullet(text = "\uD83D\uDCCC Out of scope"),
                Bullet(text = "\uD83E\uDD16 Automatic convertion")
            )
        }
    }

    slide(Class.Overlay) {
        title = "Ego"
        background {
            image = "obelisco.jpg"
        }
    }

    slide(Class.Overlay, Class.TitleBottom) {
        quote {
            text = "Every decision about code reviews has to take into account that there is a lot of ego and pride" +
                    "involved both on the side of the developer and reviewer"
        }
        background {
            image = "obelisco.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "What a ego is?<br>The argentinian that everyone has inside"
        }
        background {
            image = "diego.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text =
                "The Pope's name was controversial, due he is argentininan, people though he will call himself Jesus II"
        }
        background {
            image = "pope.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Game of Comments"
        background {
            image = "throne-ned.jpg"
        }
    }

    slide(Class.NoBackground) {
        p {
            comment {
                text = "The naming of this variable could be a little confusing, I don’t fully understand it. " +
                        "Don’t do always the same"
            }
        }
    }

    slide(Class.NoBackground) {
        p {
            comment {
                text = "I do like this solution a lot, the strategy pattern it’s pretty well used, " +
                        "but why you didn’t use a command pattern also?"
            }
        }
    }

    slide(Class.NoBackground) {
        p {
            comment {
                text = "What do you think if we add a command pattern to handle the actions?\n" +
                        "In TICKET-1234 we will have to add a new type of product and the command pattern could help us, " +
                        "that makes sense to you?\n"
            }
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "There aren't enough swear-words in the English language, so now I'll have to call you " +
                    "perkeleen vittupää just to express my disgust and frustration with this crap"
            author = "Linus Torvalds"
        }
        background {
            image = "linus.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Receiving _feedback_"
        background {
            image = "gif-jon-fight.gif"
        }
    }

    slide(Class.Overlay) {
        title = "Step out of your comfort zone"
        background {
            image = "wall.jpg"
        }
    }

    slide(Class.NoBackground) {
        bullets {
            stepped = true
            items = listOf(
                Bullet(text = "Be grateful for the feedback"),
                Bullet(text = "You are not your code"),
                Bullet(text = "Be open-minded"),
                Bullet(text = "Written comments looks ruder"),
                Bullet(text = "Breath 10 times before to reply"),
                Bullet(text = "Think about their vocabulary")
            )
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "Hodor, hodor, hodor, hodor, hodor, hodor, hodor, hodor, hodor, hodor..."
        }
        background {
            image = "hodor.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "_Problems_ in Targaryen Consulting"
        background {
            image = "melisandre.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "I just want to close my ticket"
        }
        background {
            image = "samsa.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "I'll wait till someone else approves to approve too"
        }
        background {
            image = "guys.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "She is a rockstar, her code is better than mine. I'm not commenting"
        }
        background {
            image = "jon-snow-snow.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "Ugh! Another code review..."
        }
        background {
            image = "screaming.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "I'll do the Terms of Service review"
        }
        background {
            image = "ramsay-face.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "I just want to close my ticket"
        }
        background {
            image = "jon-crying.jpg"
        }
    }

    slide(Class.Overlay) {
        quote {
            text = "Today I've had a bad day. Let's do a Code Review"
        }
        background {
            image = "danny-bad.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Wrapping _up_"
        background {
            image = "sisters.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "I's not for _everyone_"
        background {
            image = "throne.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "No place for _ego_"
        background {
            image = "gif-ego.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "No place for very _sensitive_"
        background {
            image = "gif-jon-sensible.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Not for _SDD_"
        subtitle = "Schedule \uD83D\uDDD3 Driven Development"
        background {
            image = "gif-white-walker.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "It can _break_ your team"
        background {
            image = "knives.jpg"
        }
    }

    slide(Class.Overlay) {
        title = "Be _thankful_ for the feedback"
        background {
            image = ""
        }
    }

    slide(Class.Overlay) {
        title = "Use it to _improve_ your company, your code and yourself"
        background {
            image = ""
        }
    }

    slide {
        background {
            image = "arguing.jpg"
        }
    }

    slide {
        background {
            image = "kit-danny-yes.jpg"
        }
    }

    slide {
        background {
            image = "kit-danny-no.jpg"
        }
    }

    slide {
        title = "_Disclaimer_"
    }

    slide(Class.NoBackground) {
        title = "Nobody is perfect<br><br>"
    }

    slide(Class.Overlay) {
        title = "Nobody is perfect,<br>but a _Team_ can be"
        background {
            image = "gif-walking.gif"
        }
    }

    slide(Class.Overlay) {
        title = "I'm an imperfect part of a<br>_perfect team_"
        background {
            image = "tuenti-kitchen.jpg"
        }
    }

    slide {
        background {
            image = "questions.jpg"
        }
    }

}