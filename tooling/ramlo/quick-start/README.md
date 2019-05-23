---
publication: 'RAML Playground'
tags: ['RAML', 'Quick Start']
license: 'cc-40-by'
---

# Intro to ramlo

This is an introduction to [ramlo](https://github.com/PGSSoft/ramlo). ramlo is a command line tool based on Node.js for generating RESTful API documentations written in RAML.

## Install

```sh
$ npm install -g ramlo
```

## Run

Download example RAML:

```sh
$ curl -o api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/typesystem/simple.raml
```

Run the command to generate documentation:

```sh
$ ramlo -f api.raml
```

Now you can browse the generated html:

```sh
$ browse index.html
```
