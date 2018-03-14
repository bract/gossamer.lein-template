(ns {{name}}.init
  (:require
    [{{name}}.web :as web]))


(defn app-init
  [context]
  (assoc context
    :gossamer/calfpath-routes (web/make-routes)))
