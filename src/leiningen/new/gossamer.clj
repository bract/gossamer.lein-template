(ns leiningen.new.gossamer
  (:require [leiningen.new.templates :refer [renderer year date name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "gossamer"))

(defn gossamer
  "Generate 'gossamer' application."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :year (year)
              :date (date)}]
    (main/info "Generating fresh 'lein new' gossamer project.")
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["README.md"   (render "README.md"   data)]
      ["src/{{sanitized}}/init.clj"      (render "src/init.clj" data)]
      ["src/{{sanitized}}/web.clj"       (render "src/web.clj" data)]
      ["src/{{sanitized}}/util.clj"      (render "src/util.clj" data)]
      ["test/{{sanitized}}/web_test.clj" (render "test/web_test.clj" data)]
      ["test/jetty-logging.properties"   (render "test/jetty-logging.properties" data)]
      ["resources/logback.xml"           (render "resources/logback.xml" data)]
      ["resources/bract-context.edn"     (render "resources/bract-context.edn" data)]
      ["test/bract-context.dev.edn"      (render "test/bract-context.dev.edn" data)]
      ["resources/baseconfig.edn"        (render "resources/baseconfig.edn" data)]
      ["config/config.edn"               (render "config/config.edn" data)]
      ["config/config.dev.edn"           (render "config/config.dev.edn" data)])))
