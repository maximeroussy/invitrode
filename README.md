![logo](/extras/invitrode.png)

A Java/Android library to generate random english pronounceable words based on a collection of constructed bi-grams.

[![MIT License](http://img.shields.io/badge/license-MIT-green.svg)](https://github.com/maximeroussy/invitrode/license.md) ![CI Build](https://travis-ci.com/maximeroussy/invitrode.svg?branch=master) [![GitHub release](https://img.shields.io/github/release/maximeroussy/invitrode.svg)](https://GitHub.com/maximeroussy/invitrode/releases/)

## Summary
This is a lightweight and focused library. There's a single class with only a single public method that's accessible.

This library can be used in an infinite amount of ways:
- generate initial passwords for your user based applications
- suggest character names in your games
- find a unique name for your child
- the list goes on...

## Demo
Here's a simple Android app built with the library that demonstrates it's usage:

<p>
<a href="https://github.com/maximeroussy/invitrode/blob/master/android-demo.gif"><img src="/android-demo.gif" align="center" height="500"></a>
</p>

This demo app is available on [Google Play](https://play.google.com/store/apps/details?id=com.maximeroussy.invitrodeandroid).

## Download/Install
The library is available through jCenter, which is included in your repositories by default on Android. For a Java 
project, make sure you have jCenter added to your repositories.

### Gradle (preferred):

```gradle
compile 'com.maximeroussy.invitrode:invitrode:2.0.1'
```

### Maven:

```xml
<dependency>
  <groupId>com.maximeroussy.invitrode</groupId>
  <artifactId>invitrode</artifactId>
  <version>2.0.1</version>
  <type>pom</type>
</dependency>
```

### Manual

You can grab the jar for the [latest release](https://github.com/maximeroussy/invitrode/releases) to include in your project manually.

## Usage
Using the library is extremely simple.

```java
WordGenerator generator = WordGenerator();
String myNewWord = generator.newWord(int lengthOfWord);
```

## Inspiration & Credits
Why the name Invitrode? Why make a random word generator? This should suffice:
[https://www.youtube.com/watch?v=FbccrO8qKog](https://www.youtube.com/watch?v=FbccrO8qKog)

Bi-gram source and general concept based on [Scrollback's generate.js](https://github.com/scrollback/scrollback/blob/master/lib/generate.js)  & described in [this blog post](https://www.hackerearth.com/notes/random-pronouncable-text-generator/)  by Aravind. This is a Java adaptation that will be further developed as a functional and feature rich random word generator.

## License
The MIT License (MIT)

Copyright (c) 2018 Maxime Roussy

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
