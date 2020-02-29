(defproject nrepl-servlet-context "0.1.1"

  :description "Provides a ServletContextListener that starts nrepl
  server in the web application."

  :url "http://none.com"

  :license {:name "Eclipse Public License" :url "http://none"}

  :source-paths ["src"]
  
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [nrepl/nrepl "0.6.0"]
                 [javax.servlet/servlet-api "2.5"]
		]


  :aot [nrepl-servlet-context.core]
  
  :profiles {:dev
             {:dependencies [[javax.servlet/servlet-api "2.4"]]}})
