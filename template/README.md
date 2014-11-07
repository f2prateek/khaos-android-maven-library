{{basename}}
--------------

{{description}}


Usage
-----

TODO: Fill this in. I don't usually know the API for my projects before I start so this isn't templated just yet.


Download
--------

Download [the latest JAR][2] or grab via Maven:

```xml
<dependency>
  <groupId>{{packageName}}</groupId>
  <artifactId>{{basename}}</artifactId>
  <version>1.0.0</version>
</dependency>
```
or Gradle:
```groovy
compile '{{packageName}}:{{basename}}:1.0.0'
```


License
-------

    Copyright {{date date 'YYYY'}} {{owner}}

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



 [1]: http://github.com/{{githubUserName}}/{{basename}}
 [2]: http://repository.sonatype.org/service/local/artifact/maven/redirect?r=central-proxy&g={{packageName}}&a={{basename}}&v=LATEST
