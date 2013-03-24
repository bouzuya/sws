(ns sws.handler
  (:use [compojure.route :only [files]]
        [ring.adapter.jetty :only [run-jetty]])
  (:gen-class))

(defn -main
  [& args]
  (let [port (Integer/parseInt (first args))
        root (second args)]
    (run-jetty (files "/" {:root root}) {:port port})))

