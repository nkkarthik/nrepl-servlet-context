(ns nrepl-servlet-context.core
  (use [clojure.tools.nrepl.server :as nrepl :only (start-server)]))

(gen-class
 :name org.simplefire.nrepl.StartNReplServletContextListener
 :implements [javax.servlet.ServletContextListener])

(defn -contextInitialized [this event]
  (let [port (Integer/parseInt
                 (or (-> event
                         (.getServletContext)
                         (.getInitParameter "nrepl-port"))
                     5000))]
    (print "Starting nrepl server on port" port "...")
    (try
      (start-server :port port)
      (println "started")
      (catch Exception e (println "Could not start nrepl server" e)))))

(defn -contextDestroyed [this event])
