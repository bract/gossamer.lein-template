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
  [request]
  {:status 200
   :body "TODO"})


(defn post-item
  [request]
  {:status 201
   :headers {"Location" "http://localhost:3000/items/TODO"}})


(defn get-item
  [request]
  (let [item-id (:item-id request)]
    {:status 200
     :body "TODO"}))


(defn make-routes
  []
  [{:uri "/"      :method :get :handler home}
   {:uri "/items" :nested [{:method :get  :handler list-items}
                           {:method :post :handler post-item}]}
   {:uri "/items/:item-id" :method :get :handler get-item}])
