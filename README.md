# lein-repl-run

A Leiningen plugin to run a program with a background nrepl server.

## Scenario

Have you ever started a Clojure program, only to later think: "dang, I wish I
could attach a repl to this thing?"

And did you then: modify your program to manually start an nrepl server?

And did you finally: realize that the only thing standing between you and a
horrific backdoor is a one-character misspelling in
`(when (= environment "development") ...)` but this is really is convenient so
let's just not let Bob touch this file and we'll probably come through all right
in the end?

LIVE IN FEAR NO LONGER

When you use this plugin as a drop-in replacement for `lein run`, it
automatically starts an nrepl server in the background. When you don't need it,
you can ignore it. But like a trusty old hat, it's comfortably waiting on there
on the rack for when you need it the most.

And the best part is that because you're not compiling it into your jar, you're
not inadvertantly backdooring yourself.

## Usage

Put `[lein-repl-run "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:user` profile.

And then, from your project directory:

    $ lein repl-run

Or, if you don't like typing:

    $ lein rrun

You can also pass through arguments to `run`:

    $ lein rrun -m foo.bar.main

## License

Copyright © 2014 Jim Brusstar

Distributed under the Eclipse Public License, same as Clojure.
