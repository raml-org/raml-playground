---
publication: 'RAML Playground'
tags: ['RAML', 'Quick Start']
license: 'cc-40-by'
---

# Intro to brujula

This is an introduction to [brujula](https://github.com/nogates/brujula). brujula is a Ruby RAML parser aiming for a full version 1.0 support.

## Install

```sh
$ gem install brujula
```

## Run

Download example RAML:

```sh
$ wget -O api.raml https://raw.githubusercontent.com/raml-org/raml-examples/master/typesystem/simple.raml
```

Create a file called `example.rb` with the following content:

```ruby
require 'brujula'

raml = Brujula.parse_file('api.raml')

puts raml.inspect
puts raml.to_yaml
```

And run it to see RAML being parsed and logged:

<script src="https://gist.github.com/postatum/ffff471dac3d62be27ebce89d2876f20"></script>