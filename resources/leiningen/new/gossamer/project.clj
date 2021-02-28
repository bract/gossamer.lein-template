(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME"
  :url "FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :resource-paths ["resources" "target/generated/resources"]  ; see :project-edn entry
  :pedantic?    :warn
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [bract/gossamer.core "0.6.1-0.2.0"]
                 ;; web servers (uncomment any one)
                 [aleph                   "0.4.6" :exclusions [org.clojure/tools.logging]]
                 ;;[http-kit                "2.5.3"]
                 ;;[org.immutant/immutant   "2.1.10"]
                 ;;[ring/ring-jetty-adapter "1.9.1"]
                 ]
  :repl-options {:port 3001}
  :target-path "target/%s"
  :plugins [[lein-project-edn "0.2.0"]
            [lein-ring        "0.12.3"]]
  :hooks [leiningen.project-edn/activate]
  :project-edn {:output-file "target/generated/resources/project.edn"
                :verify-edn? true}
  :ring {:handler bract.ring.dev/handler
         :init    bract.ring.dev/init!
         :port    3000
         :nrepl   {:start? true :port 3001}}
  :profiles {:dev     {:dependencies [[bract/bract.dev "0.6.1-0.1.0"]]
                       :source-paths ["dev"]}
             :uberjar {:aot [bract.core.main]
                       :main ^:skip-aot bract.core.main
                       :pedantic? :abort}})
