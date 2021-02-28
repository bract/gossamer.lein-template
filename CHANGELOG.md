# gossamer/lein-template Change Log

## TODO

None


## 0.3.0 / 2021-February-28

- Use Clojure 1.10.3
- Upgrade to gossamer.core 0.6.2-0.3.0
- Upgrade to bract.dev 0.6.2
- Set REPL to `bract.dev.repl`
  - Do not generate `dev/user.clj` anymore
- Set DEV mode `:main` to `bract.core.dev`


## 0.2.1 / 2019-January-12

- Fix gossamer.core dependency version to `0.2.0` (not SNAPSHOT version)


## 0.2.0 / 2019-January-10

- Upgrade to gossamer.core 0.6.1-0.2.0
  - Drop dependencies `bract.cli` and `bract.ring`
- Use context from gossamer.core
  - bract-context.edn
  - bract-context.dev.edn
- Drop namespaces `app.command` and `app.keydef`
- Drop utility fn `handle-uncaught-exception`
- Drop common app config from `baseconfig.edn`


## 0.1.4 / 2019-January-06

- Use Clojure 1.10.0
- Use gossamer.core 0.6.1-0.1.1 (gets Calfpath 0.7.1)
- Use ring-jetty-adapter 1.7.1 (commented)
- Generate copyright year from the current year
- Add FIXME label to generated project description


## 0.1.3 / 2018-December-25

- Fix order of applying routes wrappers and calfpath-routes->ring-handler inducers
- Configure wrappers to apply to the Ring handler
- Configure middleware to apply to the Ring handler


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
