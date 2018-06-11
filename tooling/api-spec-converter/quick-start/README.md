---
publication: 'RAML Playground'
tags: ['RAML', 'tutorial']
license: 'cc-40-by'
---

# Intro to API Spec Transformer

This is an introduction to API Spec Transformer. API Spec Transformer is a tool that helps to convert between different API specifications. It currently supports OAS (Swagger 2), RAML 0.8, RAML 1.0, and Postman collections.

## Install

```sh
npm install api-spec-transformer
```

## Run

To convert RAML1.0 to OAS (Swagger), download example RAML:

```sh
wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/helloworld/helloworld.raml
```

Create an `index.js` file with the following code:

```js
const transformer = require('api-spec-transformer')

const ramlToSwagger = new transformer.Converter(
  transformer.Formats.RAML10,
  transformer.Formats.SWAGGER)

ramlToSwagger.loadFile('./api.raml', (err) => {
  ramlToSwagger.convert('yaml')
    .then((convertedData) => console.log(convertedData))
})
```

Run it:

```sh
node index.js
```