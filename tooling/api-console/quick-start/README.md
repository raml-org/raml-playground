---
publication: 'RAML Playground'
tags: ['RAML', 'tutorial']
license: 'cc-40-by'
---

# Intro to api-console

This is an introduction to api-console. api-console is a tool that generates mobile-friendly web documentation based on RAML documents. In addition to providing documentation, the tool provides the capability for users to try out requests on the fly.

## Install

```sh
sudo npm install -g api-console-cli
```

## Run

```sh
wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/helloworld/helloworld.raml
api-console build ./api.raml
api-console serve build/
```


NOTE:
    Errors using api-console-cli@1.0.0. Wait till this bug is fixed https://github.com/mulesoft-labs/api-console-cli/issues/28; Other than that - example works fine (e.g. when using older cli version).