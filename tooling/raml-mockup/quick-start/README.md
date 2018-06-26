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
HTTP/1.1 200 OK
Access-Control-Allow-Headers: Content-Type, Content-Length
Access-Control-Allow-Methods: *
Access-Control-Allow-Origin: *
Access-Control-Expose-Headers: Accept-Ranges, Content-Encoding, Content-Length, Content-Range
Connection: keep-alive
Content-Length: 25
Content-Type: application/json; charset=utf-8
Date: Tue, 12 Jun 2018 07:52:43 GMT
ETag: W/"19-xiRlAiCAu+T5Wg8+Nm/uG4L47fI"
X-Powered-By: Express

{
    "message": "Hello world"
}
```