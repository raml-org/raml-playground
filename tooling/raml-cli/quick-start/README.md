---
publication: 'RAML Playground'
tags: ['RAML', 'tutorial']
license: 'cc-40-by'
---

# Intro to raml-cli

This is an introduction to [raml-cli](https://github.com/raml-org/raml-cli). raml-cli is a handy command-line tool for RAML enthusiasts. It's features include:
    * Validation of a root RAML document against the specification;
    * Compilation of a root RAML document into a valid OpenAPI 2.0 document;
    * Initialization of a basic RAML document based on user input;
    * Mocking of a root RAML document.

## Install


```sh
$ npm install -g raml-cli
```

## Run

Download example RAML:

```sh
$ wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/typesystem/simple.raml
```

1. Validate a root RAML document against the specification:

```sh
$ raml validate api.raml
Validating api.raml...
Valid!
```

2. Compile a root RAML document into a valid OpenAPI 2.0 document:

```sh
$ raml compile api.raml
Compile api.raml...
Successfully compiled OAS 2.0 document.
```

New file called `openapi.yml` should appear with the following content:

<script src="https://gist.github.com/postatum/83ab380edb43924854f57a5bd32b6965"></script>

3. Initialize a basic RAML document based on user input:

```sh
$ raml init
init...
? What is the title of your API? (empty string is not allowed): Dogs API
? How would you describe your API? (Enter to skip): Greatest API ever
{ title: 'Dogs API', description: 'Greatest API ever' }
Initialization successful!

$ cat api.raml
#%RAML 1.0
title: Dogs API
description: Greatest API ever
```

4. Mock a root RAML document (re-download example RAML first):

```sh
$ raml mock api.raml
Mock service running at http://localhost:8080

$ http http://localhost:8080/users/1
HTTP/1.1 200 OK
Content-Type: application/json
(...)
```