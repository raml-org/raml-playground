---
publication: 'RAML Playground'
tags: ['RAML', 'tutorial']
license: 'cc-40-by'
---

# Intro to godoc2api

This is an introduction to godoc2api. godoc2api is a command line tool that helps to turn your golang comments into a RAML 1.0 file describing your API.

## Install

```sh
go get github.com/florenthobein/godoc2api
```

## Run

Create a file named `main.go` with the following code (note comments):

<script src="https://gist.github.com/postatum/36e66baa6482986d2ad2bf5e4cf4e446"></script>

Run it with `go run main.go`, then stop the server. Now you should see generated RAML file at `./raml/your_api_v1.raml` with a similar content:

```raml
#%RAML 1.0
---
title: Your API
version: v1
baseUri: http://localhost:3000
mediaType: application/json
/dogs:
  get:
    description: An endpoint that just says something about dogs
```
