---
publication: 'RAML Playground'
tags: ['RAML', 'Quick Start']
license: 'cc-40-by'
---

# Intro to raml-1-parser

This is an introduction to [raml-1-parser](https://github.com/raml-org/raml-js-parser-2). raml-1-parser is a JavaScript RAML parser that supports both RAML 0.8 and 1.0.

## Install

```sh
$ npm install raml-1-parser
```

## Run

Download example RAML:

```sh
$ wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/helloworld/helloworld.raml
```

Create new file `index.js` with the following code:

```js
const raml = require('raml-1-parser')
raml.load('./api.raml').then((apiJSON) => {
  console.log(JSON.stringify(apiJSON, null, 2))
})
```

Run it with:

```sh
$ node ./index.js
```

Parsing can also be performed synchronously:
```js
const raml = require('raml-1-parser')
const apiJSON = raml.loadSync('./api.raml')
console.log(JSON.stringify(apiJSON, null, 2))
```