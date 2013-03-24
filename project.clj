(defproject sws "0.1.0"
  :description "A simple web server"
  :url "http://github.com/bouzuya/sws"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [ring/ring-jetty-adapter "1.1.0"]]
  :main sws.handler)
