(ns ticket-voter.core
  (:gen-class))

(def ticket-collection (atom (hash-map)))

(defn add-ticket-vote
  "Adds given vote to the list assigned to ticket-name keyword."
  [ticket-name vote]
  (let [ticket-key (keyword ticket-name)]
       (swap! ticket-collection update-in [ticket-key] #(cons vote %))
       ))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
