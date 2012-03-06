
(ns clojure-talk.web
    (:use compojure.core
          ring.middleware.reload
          [ring.adapter.jetty :only [run-jetty]]))

(defroutes main-routes
    (GET "/" [] "Hello, World!"))

(defn app []
    (-> #'main-routes
        (wrap-reload 'clojure-talk.web)))

(defn start-server []
    (run-jetty (app) {:port 8001 :join? false}))

