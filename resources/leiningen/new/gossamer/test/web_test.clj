(ns {{name}}.web-test
  (:require
    [clojure.test :refer :all]
    [bract.core.dev :as dev]
    [bract.core.dev-init]))


(def ring-handler (:bract.ring/ring-handler dev/app-context))


(deftest a-test
  (is (= {}
        (ring-handler {:uri "/items"
                       :request-method :get}))))
