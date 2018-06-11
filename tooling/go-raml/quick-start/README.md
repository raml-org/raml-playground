---
publication: 'RAML Playground'
tags: ['RAML', 'tutorial']
license: 'cc-40-by'
---

# Intro to go-raml

This is an introduction to go-raml. go-raml is a tool that currently has these features:
    * generate server stub in Go, Python, and Nim from a RAML file;
    * generate complete client library in Go, Python, and Nim from a RAML file;
    * generate `capnp` schema.


## Install

Assuming your project is located inside `/gopath/src/github.com/myuser/myapi`:

```sh
cd /gopath/src/github.com/myuser/myapi
go get -u github.com/Jumpscale/go-raml
```

## Run

All commands listed here should be run inside `/gopath/src/github.com/myuser/myapi`.

Download example RAML:

```sh
wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/helloworld/helloworld.raml
```

Generate server:

```sh
TODO: https://github.com/Jumpscale/go-raml#generating-server

```