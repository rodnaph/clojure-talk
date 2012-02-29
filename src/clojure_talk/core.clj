
(ns clojure-talk.core
    (:use compojure.core
          ring.middleware.params
          ring.middleware.reload
          [hiccup core form-helpers]))

(defn show-results-page
    [{:keys [params]}]
    "Results")

(defn show-search-page
    [{:keys [params]}]
    (html [:form

(defroutes main-routes
    (GET "/" [] show-search-page)
    (GET "/:q" [] show-results-page))

(def app 
    (-> main-routes
        (wrap-params)
        (wrap-reload 'clojure-talk.core)))

