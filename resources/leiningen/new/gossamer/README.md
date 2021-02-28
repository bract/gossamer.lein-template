# {{name}}

FIXME

## Usage

FIXME


## Development

### Build & Run

```shell
lein do clean, uberjar
java -jar {{name}}-0.1.0-SNAPSHOT-standalone.jar -vf config/config.edn
```


### Web server in

Start the application using Jetty web server (with automatic namespace-reload support) using the command
`lein ring server-headless`.


### REPL and "Reloaded" support

Start the REPL using `lein repl` command. Enter `(help)` to list convenience functions available for the REPL.


### Running tests

Run the tests using `lein test` command. Application initialization is transparently finished before tests are run.


### Customization

Switching web server:
- Uncomment the desired web server dependency in `project.clj`
- Update the value of key `:bract.ring/server-starter` in `resources/bract-context.edn`


## License

Copyright © {{year}} FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
