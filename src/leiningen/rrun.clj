(ns leiningen.rrun
  (:require [leiningen.repl-run :as repl-run]))

(defn rrun
  "Alias for repl-run."
  [& args]
  (apply repl-run/repl-run args))
