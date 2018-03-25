(ns {{name}}.util
  (:require
    [cambium.core :as log]))


(log/deflogger metrics "METRICS")


(defn handle-uncaught-exception
  "Callback function for handling uncaught exceptions."
  [^Thread thread ^Throwable ex]
  (log/error (Throwable->map ex) ex (format "Uncaught exception on thread ID: %d, thread name: %s - (%s) %s"
                                      (.getId thread) (.getName thread) (class ex) (.getMessage ex))))
