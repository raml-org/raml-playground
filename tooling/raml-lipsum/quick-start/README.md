---
publication: 'RAML Playground'
tags: ['RAML', 'tutorial']
license: 'cc-40-by'
---

# Intro to raml-lipsum

This is an introduction to raml-lipsum. raml-lipsum is a tool that generates random data from RAML 1.0 type specifications.

## Install


```sh
$ npm install raml-lipsum -g
```

## Run

Download example RAML:

```sh
$ wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/typesystem/simple.raml
```

Now from a command-line run:

```sh
$ raml-lipsum ./api.raml User > user-data.json
```

It should generate random User data:

```sh
$ cat user-data.json
{
  "firstName": "sint",
  "lastName": "nostrud",
  "age": 31212.484780674236
}
```

The tool can also be used from javascript code like so:

```js
const RAMLGenerator = require('raml-lipsum')

const generator = new RAMLGenerator('./api.raml')
const userData = generator.generate('User')
console.log(JSON.stringify(userData))
```
