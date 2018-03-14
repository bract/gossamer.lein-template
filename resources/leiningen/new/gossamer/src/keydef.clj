(ns {{name}}.keydef
  (:require
    [keypin.core :as keypin]
    [keypin.util :as kputil]))


(keypin/defkey
  app-version ["app.version" string? "Application version"])
