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


## Initially Publishing the Site

> This only needs to be done once.

We publish the site to Githubs `gh-pages`, setup the branch (one time) with the following:

```bash
# Using a fresh, temporary clone is safest for this procedure
$ mkdir temp
$ git clone git@github.com:youruser/yourproject.git
$ cd yourproject

# Create branch with no history or content
$ git checkout --orphan gh-pages
$ git rm -rf .

# Establish the branch
$ git commit --allow-empty -m "initialize gh-pages branch"
$ git push origin gh-pages
```

Then delete the `temp` folder, you have a new empty branch. When that branch has HTML in it (say, a jekyll site), when you push, Github will "deploy" the HTML to it's web servers. Visit the published site with https://xp-dojo.github.io/xp-dojo.

### Domain Names

If you have a domain name (like we do), add it to a file called `CNAME` and the above will redirect to it. Setup that domain name server to [point back to Github](https://www.google.com/search?q=setup+godaddy+cname+github+pages&rlz=1C5CHFA_enGB769GB769&oq=setup+godaddy+cname+github+pages&aqs=chrome..69i57.5277j0j7&sourceid=chrome&ie=UTF-8) (just a `A` records is enough). This [articles](https://hackernoon.com/how-to-set-up-godaddy-domain-with-github-pages-a9300366c7b) goes into a little more depth around HTTPS (notably, the older `192.30.252.153` don't support HTTPS so you want to be using the `185.199.108.153` alternatives).

Then go enjoy https://xp-dojo.org 
