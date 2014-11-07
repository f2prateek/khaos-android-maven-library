khaos-android-maven-library
===========================

A [Khaos](https://github.com/segmentio/khaos) template to start new Android Libraries built with Maven quickly.

Installation
============

Make sure you have node installed.

Save the template locally with:

    $ khaos --save f2prateek/khaos-android-maven-library android-maven-library

This is optional, you can directly create projects from the Github repo too.

Usage
=====

Create a new project with:

    $ khaos android-maven-library my-project

If you haven't saved the template locally, you can also use the command below to generate a project.

    $ khaos create f2prateek/khaos-android-maven-library my-project

This will prompt you for the following:

         description: A one-liner about what your project will do. This will be used in the generated pom and Readme.
         packageName: The Java package name it should live under. This will also be used as the Maven groupId.
               owner: Your full name, used in the pom and in the genrated copyright.
      githubUserName: Your Github username

TODO
====
* Generate directory structure based on package name

License
=======

    Copyright 2014 Prateek Srivastava

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
