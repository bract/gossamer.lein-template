# gossamer.lein-template

An opinionated Leiningen template to create web applications using the [Bract/Gossamer](https://bract.github.io)
micro web framework. The template is minimal but can be easily extended, thanks to Bract, in various ways.


Latest version (on Clojars): `0.1.4`


### Out of the box features

- CLI options
  - Available when running as uberjar
  - Commands to run app, specify config files, print config etc.
  - Extensible: Custom application commands may be added
- Configuration
  - Running as uberjar: Specify via CLI, In development: By convention
  - Configuration files may be chained to multiple parent files
  - Variable substitution support in configuration files
  - Configuration files may be placed in classpath or filesystem
- Development workflow
  - Tweaking verbosity and configuration at the REPL
  - Easy customizable integration with clojure.test (any test framework)
  - REPL support for starting/stopping/reloading app (Reloaded workflow)
- Logging
  - JSON, Text and Console logging are available by default
  - Provided extensively customizable Logback configuration
- Web
  - Ring based request serving and middleware
  - Feature flag based middleware application
  - Data-driven web routing using Ring-handler
  - Included Aleph web server, easily swappable


### Bract modules/Libraries used

- [bract.core](https://github.com/bract/bract.core)
  - [Keypin](https://github.com/kumarshantanu/keypin) for configuration files
- [bract.cli](https://github.com/bract/bract.cli)
  - [tools.cli](https://github.com/clojure/tools.cli) for CLI argument parsing
- [bract.ring](https://github.com/bract/bract.ring)
  - Optional out of the box support for web servers
    - [Aleph](http://aleph.io/), based on [Netty](https://netty.io/)
    - [HTTP Kit](http://www.http-kit.org/)
    - [Immutant](http://immutant.org/)
    - [Jetty](https://www.eclipse.org/jetty/)
- [gossamer.core](https://github.com/bract/gossamer.core)
  - [Cambium](https://cambium-clojure.github.io/) for mature, flexible structured logging
  - [Calfpath](https://github.com/kumarshantanu/calfpath) for very fast data-driven web routing
  - [Cheshire](https://github.com/dakrone/cheshire) for mature, very fast JSON encoding/decoding
- [bract.dev](https://github.com/bract/bract.dev)
  - [tools.namespace](https://github.com/clojure/tools.namespace) for namespace reloading (dev mode)


## Usage

```shell
lein new gossamer {{project-name}}
cd {{project-name}}
lein ring server-headless  # start web server in dev mode
lein do clean, uberjar     # generate uberjar
java -jar {{project-name}}-{{version}}-standalone.jar -vf config/config.edn  # run uberjar
lein test
lein repl
```


## License

Copyright © 2018-2019 Shantanu Kumar (kumar.shantanu@gmail.com, shantanu.kumar@concur.com)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

