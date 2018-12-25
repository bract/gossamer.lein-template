# gossamer/lein-template Change Log

## TODO

None


## 0.1.3 / 2018-December-??

- [Todo] Fix order of applying routes wrappers and calfpath-routes->ring-handler inducers
- [Todo] Configure wrappers to apply to the Ring handler
- [Todo] Configure middlewares to apply to the Ring handler


## 0.1.2 / 2018-October-10

- Use Bract 0.6.1 components
- Use Aleph 0.4.6
- Use `:repl-options` to set port to 3001
- Use reloadable homepage handler
- Fix `/items/:id` URI handler call


## 0.1.1 / 2018-May-24

- Fix typo in `?` function in generated `dev/user.clj`


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
