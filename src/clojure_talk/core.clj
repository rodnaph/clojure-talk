
(ns clojure-talk.core
    (:use compojure.core
          ring.middleware.reload))

(defroutes main-routes
    (GET "/" [] "Hello, Unified Diff!"))

(def app 
    (-> main-routes
        (wrap-reload 'clojure-talk.core)))

