---
layout: docs
title: Introduction
---
# Contributing

Everyone is welcome to contribute. We follow a standard open source / GitHub model and will review pull requests from everyone (see an example of [unsolicited grammar improvements](https://github.com/xp-dojo/atdd-bank-account/pull/16)). If you're not confident with the idea of pull requests, start with [https://help.github.com/en/articles/about-pull-requests](https://help.github.com/en/articles/about-pull-requests). 

This document describes:

* Agreements contributors have accepted, forming a kind of code of conduct of how we build materials out
* Minimum required artifacts that we feel contribute to a good workshop
* Licensing information
* Committing and contribution model


# Agreements

For core contributors (those with write permission to the repositories), we aim to agree consensus on our goals and some specific mechanisms. This is mainly motivated by a need for consistency in both how the material is delivered (making it easy for students to learn) and ideology in what we can agree on as an effective way to teach.


## Learning Objectives

This is the first thing to focus on. What are the learning objectives we're trying to convey. If we can't express them clearly, it's unlikely the session will land well. Amazon start with a press release. Think of this as our press release. Write it first then check if we've met them at the end.

Add this to the README.


## Minimum Artifacts

Each repository should have the following.

1. `README.md`
1. `INSTRUCTORS.md`
1. `instructors` branch

Additionally, consider adding slides or supporting material to introduce the sessions. Slides should be named `slides.pptx` so instructors know where to look and generally we favour short introductions and encourage hands of keys as soon as possible.


### README.md

The README is the customer facing entry point for the workshops. It should convey the purpose and learning objectives of the session along with instructions that students follow. It's not a project page for the contributors. 

You should try to maintain the convention and house style of the other repositories (using markdown appropriately for heading and section structure for example).

The README should also contain a license summary, see below.

Appropriate content:

* Overview of the session directed at the student (this is the marketing hook)
* Prerequisites and setup instructions. Explain what's required before starting (Java, internet, IDE) and what's required to download the project (`git clone ...`) and open it
* Specific instructions for the session. This is the 'ask'
* Background material / educational content
* Additional reading references
* Licence summary (see below)


### INSTRUCTORS.md

The instructor's README is more like the project page for the repository. It's more relaxed as the audience is contributors and instructors. This should be the place we capture notes about running the session and any trouble shooting recipes we've come up with. Empathise with someone coming back to teach the session not having done so for several months. 

Appropriate content:

* Session introduction notes. What do you want to cover before kicking off?
* Links to slides for quick reference
* Session overview / how it should run / timings
* A link to the instructor branch (for quick reference)
* Trouble shooting / common problem solving that require an instructor
* Possible extensions


### Instructor Branch

Typically, we will have worked on a reference implementation. This should live on a branch called `instructors`. This gives us something to refer back to. The `master` branch should represent **the starting point for students**.


### License

Licensing is an important consideration to protect contributors and make it easy for consumers to understand their rights. Generally, there is no intellectual property in the materials and we intend them to be freely available.

Authors automatically claim copyright during the act of authoring, licensing is different. Each repository **must** be licensed as follows. 

* **Source code** should be licensed with the **APACHE 2.0**. There should be a `LICENSE` file in the root of the project. The Apache license requires a preample in each source file, see [the details](https://www.apache.org/licenses/LICENSE-2.0#apply). 
* **Materials**, slides and educational texts should be license with the **Creative Commons** license.
* The **README** should contain a summary of the license model. Cut and paste the following.

```
# License

The content of this project (educational material, slides and alike) are licensed under the Creative Commons Attribution Share Alike 4.0 International (CC-BY-SA) license, whilst the underlying source code used to support the educational material is licensed under the Apache 2.0 license.
```

See a discussion on licensing on [issue 7](https://github.com/xp-dojo/atdd-bank-account/issues/7) of the site repository.


## Committing

It's not an ideal OSS model but we are suggesting repositories require at least two reviews before content can be merged into `master`. This can be enforced in GitHub under the projects Settings. It may sound draconian but it's trying to maintain a consensus amongst a diverse set of contributors. It means trunk based development isn't possible unfortunately.


### Dealing with Pull Requests

See above. If you receive a pull request, the nice thing to do is merge (refining as necessary locally) before closing the pull request. It's not fun leaving PRs orphaned with partially incorporated fragments, it leaves the branch useless as the author can't easily pick it up and amend the PR. Use the same [guidelines you would for OSS](https://help.github.com/en/articles/fork-a-repo) and for help, GitHub specific instructions are [here](https://help.github.com/en/articles/merging-a-pull-request).


### Accepting new Committers

Everyone can contribute via forking and pull requests. New committers (those directly added to the `instructor` team with write permission to the repositories) should be agreed and follow some evidence of prior contribution (pull requests accepted for example). An example from `@baldrick` can be found https://github.com/xp-dojo/atdd-bank-account/pull/16.