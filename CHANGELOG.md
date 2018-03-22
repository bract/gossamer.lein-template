# gossamer/lein-template Change Log

## TODO

None


## [WIP] 0.1.0-alpha2 / 2018-March-??

- Upgrade dependencies
  - bract.cli  0.6.0-alpha2
  - bract.dev  0.6.0-alpha2
  - bract.ring 0.6.0-alpha2
  - gossamer.core 0.6.0-alpha3
    - [Todo] Use GA version
- Logging
  - Generate `logback.app.base.package` config entry for included Logback config
  - [Todo] Add missing `resources/logback.xml` file
  - [Todo] Add `util.clj` for logging utility
  - [Todo] Add metrics log `application.initialized`
- Default to Aleph web server instead of Jetty
- [Todo] shutdown hook
- [Todo] global exception handler
- [Todo] Generated routes should call fns in web namespace (for reloading to work)


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
