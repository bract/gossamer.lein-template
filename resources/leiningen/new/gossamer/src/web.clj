(ns {{name}}.web)


(defn home
  [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Available endpoints:
POST /items          - post new item details
GET  /items          - list details of items
GET  /items/:item-id - get item details"})


(defn list-items
  []
  {:status 200
   :body "TODO"})


(defn post-item
  []
  {:status 201
   :headers {"Location" "http://localhost:3000/items/TODO"}})


(defn get-item
  [item-id]
  {:status 200
   :body "TODO"})


(defn make-routes
  []
  [{:uri "/"                          :method :get :handler home}
   {:uri "/items"           :nested [{:method :get  :handler (fn [request] (list-items))}
                                     {:method :post :handler (fn [request] (post-item))}]}
   {:uri "/items/:item-id"            :method :get  :handler (fn [{item-id :item-id :as request}] (get-item))}])
