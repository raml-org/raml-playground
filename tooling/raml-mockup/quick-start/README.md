---
publication: 'RAML Playground'
tags: ['RAML', 'tutorial']
license: 'cc-40-by'
---

# Intro to raml-mockup

This is an introduction to raml-mockup. raml-mockup is a tool generates Express-based mocking service for RAML development.

## Install


```sh
$ npm install -g raml-mockup
```

## Run

Download example RAML:

```sh
$ wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/helloworld/helloworld.raml
```

Start a mock-server from your RAML:

```sh
$ raml-mockup ./api.raml
```

Mocked API server is now available at `http://localhost:3000`:

```sh
$ http http://localhost:3000/helloworld
(...)

{
    "message": "Hello world"
}
```