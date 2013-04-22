(defproject nrepl-servlet-context "0.1.0"

  :description "Provides a ServletContextListener that starts nrepl
  server in the web application."

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src"]
  
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clojure-complete "0.2.2"]
                 [org.clojure/tools.nrepl "0.2.0-RC1"]]

  :aot [nrepl-servlet-context.core]
  
  :profiles {:dev
             {:dependencies [[javax.servlet/servlet-api "2.4"]]}})
