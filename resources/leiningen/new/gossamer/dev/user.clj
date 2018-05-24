(ns user
  (:require
    [bract.core.dev   :refer [start stop verbose config-files context-file]]
    [bract.dev.reload :refer [go reset restart]]))


(defn ?
  "Show help text for REPL."
  []
  (println "Bract functions available at this REPL:

(fn ?            []) - show this help text
(fn start        []) - start application (after necessary initialization)
(fn stop         []) - stop application if running
(fn verbose      [] [boolean])  - find or set verbosity override
(fn config-files [] [filenames]) - find or set config files
(fn context-file [] [filename])  - find or set context file
(fn go           []) - same as 'reset'
(fn reset        []) - stop and deinitialize app if required, reload changed namespaces, then initialize app
(fn restart      []) - stop and deinitialize app if required, reload changed namespaces, then initialize and start app
"))

