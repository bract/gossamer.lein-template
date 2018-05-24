# gossamer/lein-template Change Log

## TODO

None


## [WIP] 0.1.1 / 2018-May-??

- [Todo] Fix typo in `?` function in generated `dev/user.clj`


## 0.1.0 / 2018-May-16

- Application
  - CLI integration (uberjar workflow)
  - Standard (uberjar) and development config files
  - Initialization namespace
- Web
  - Web routing template (Calfpath)
  - Easily switchable web server support
    - Aleph (enabled by default)
    - HTTP Kit
    - Immutant
    - Jetty
  - Generated routes call reloadable fns in web namespace (with lein-ring)
- Logging
  - Logging config (inheriting gossamer.core template)
  - Text and JSON format
  - Logging initialization (using system properties)
- Lifecycle
  - Add shutdown hook
  - Add global exception handler
- Development mode
  - REPL and "Reloaded" (namespace) support in `dev/user.clj`
  - Automated initialization in test namespaces
