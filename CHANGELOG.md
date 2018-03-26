# gossamer/lein-template Change Log

## TODO

None


## 0.1.0-beta1 / 2018-March-27

- Upgrade Bract/Gossamer to 0.6.0-beta1
- Fix uberjar version in README


## 0.1.0-alpha4 / 2018-March-25

- Generated routes call reloadable fns in web namespace (with lein-ring)
- Add shutdown hook
- Add global exception handler


## 0.1.0-alpha3 / 2018-March-25

- Upgrace Bract/Gossamer to 0.6.0-alpha4


## 0.1.0-alpha2 / 2018-March-23

- Upgrade dependencies
  - bract.cli  0.6.0-alpha3
  - bract.dev  0.6.0-alpha3
  - bract.ring 0.6.0-alpha3
  - gossamer.core 0.6.0-alpha3
- Logging
  - Generate `logback.app.base.package` config entry for included Logback config
  - Add missing `resources/logback.xml` file
  - Add `util.clj` for logging utility
  - Emit metrics log `application.initialized` after app init
- Default to Aleph web server instead of Jetty


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
