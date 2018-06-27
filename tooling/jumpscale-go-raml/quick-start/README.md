---
publication: 'RAML Playground'
tags: ['RAML', 'Quick Start']
license: 'cc-40-by'
---

# Intro to Jumpscale/go-raml

This is an introduction to [Jumpscale/go-raml](https://github.com/Jumpscale/go-raml). Jumpscale/go-raml is a tool that currently has these features:
    * generate server stub in Go, Python, and Nim from a RAML file;
    * generate complete client library in Go, Python, and Nim from a RAML file;
    * generate `capnp` schema.


## Install

Assuming your project is located inside `/gopath/src/github.com/myuser/myapi`:

```sh
$ cd /gopath/src/github.com/myuser/myapi
$ go get -u github.com/Jumpscale/go-raml
```

## Run

In this introduction we'll generate Go server. All commands listed here should be run inside `/gopath/src/github.com/myuser/myapi`.

Download example RAML:

```sh
$ wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/helloworld/helloworld.raml
```

Generate Go server:

```sh
$ go-raml server -l go --dir /gopath/src/github.com/myuser/myapi --ramlfile api.raml --import-path github.com/myuser/myapi
```

Now you can check out generated files:

<script src="https://gist.github.com/postatum/5f7fa9da6f0d6532a4ea27fed7ec304d"></script>

Generated go server can be used as your API server skeleton. It gives you routing code, implementation skeleton, simple request validation, and all struct based on raml types and request/response body. You can then extend the generated code to fit your need.
