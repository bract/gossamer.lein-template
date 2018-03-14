(ns {{name}}.command
  (:require
    [bract.core.keydef :as core-kdef]
    [{{name}}.keydef :as kdef]))


(defn command-print-version
  "CLI command - print application version."
  [context]
  (let [config (core-kdef/ctx-config context)
        version (kdef/app-version config)]
    (println version))
  (reduced context))
