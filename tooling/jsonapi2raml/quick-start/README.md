---
publication: 'RAML Playground'
tags: ['RAML', 'tutorial']
license: 'cc-40-by'
---

# Intro to jsonapi2raml

This is an introduction to jsonapi2raml. jsonapi2raml is a thin wrapper around raml-js-parser-2, adding extra properties to the resulting object. Features:
    * Restructures types from [{typeA: {...}}, ...] to {typeA: {}, ...}

## Install

```sh
$ npm install jsonapi2raml -g
```

## Run

Download example JSON API payload file:

```sh
$ wget https://gist.githubusercontent.com/postatum/2bdba245ceabe5837bf3c2d4c0f23ad8/raw/9355778cb61e33d965d2d6d3efd37713cecbff0a/payload.json
```

Now let's generate RAML 1.0 documentation:

```sh
$ jsonapi2raml payload.json usersApi
```

This will generate big `usersApi.raml` file. You could check out it in your editor or just check it's content with `cat` and `grep` to see that routes were generated:

```sh
$ cat usersApi.raml | grep user
        type: "user"
        type: "user"
          type: "user"
  /user:
```
