(ns {{name}}.init
  (:require
    [{{name}}.web  :as web]
    [{{name}}.util :as util]))


(defn app-init
  [context]
  (let [routes (web/make-routes)]
    (util/metrics "application.initialized")
    (assoc context
      :gossamer/calfpath-routes routes)))
