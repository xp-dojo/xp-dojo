![](https://avatars0.githubusercontent.com/u/48089148?s=200&v=4)

The website and index of materials.

Find lecture notes and details how to run the sessions. 


## Building the Site

<p class="bg-warning">
Configured in <code>site.sbt</code>.
</p>

Run `sbt site/makeMicrosite` to create the site you're reading now. Find it in `site/target/jekyll` once built.

You should be able to preview the site using Jekyll to serve it.

    $ cd site/target/jekyll
    $ jekyll serve

If you're going to publish it (`sbt site/publishMicrosite`), make sure you `site/makeMicrosite` first (otherwise you'll see a commit on the `gh-pages` branch with `0 commits`)

