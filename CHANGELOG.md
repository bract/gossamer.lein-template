# gossamer/lein-template Change Log

## TODO

- [Todo] shutdown hook
- [Todo] global exception handler


## 0.1.0-alpha1 / 2018-March-14

- Use Bract/Gossamer 0.6.0-alpha1
- Application
  - CLI integration (uberjar workflow)
  - Standard (uberjar) and development config files
  - Initialization namespace
- Web
  - Web routing template (Calfpath)
  - Easily switchable web server support
    - Aleph
    - HTTP Kit
    - Immutant
    - Jetty (enabled by default)
- Logging
  - Logging config (inheriting gossamer.core template)
  - Text and JSON format
  - Logging initialization (using system properties)
- Development mode
  - REPL and "Reloaded" (namespace) support in `dev/user.clj`
  - Automated initialization in test namespaces
