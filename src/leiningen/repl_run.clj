(ns leiningen.repl-run
  (:require [leiningen.repl :as repl]
            [leiningen.run :as run]))

(defn repl-run
  "Run a -main function with a background repl server."
  [project & args]
  (let [cfg {:host (repl/repl-host project)
             :port (repl/repl-port project)}]
    (repl/server project cfg false))
  (apply run/run project args))
