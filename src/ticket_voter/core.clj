(ns ticket-voter.core
  (:gen-class))

(def ticket-collection (atom (hash-map)))

(defn add-ticket-vote
  "Assigns given vote to the user-name and adds it to the list assigned to ticket-name keyword."
  [ticket-name user-name vote]
  (let [ticket-key (keyword ticket-name)]
    (swap! ticket-collection update-in [ticket-key]
           #(assoc-in % [(keyword user-name)] vote))))

(defn get-ticket-votes
  [ticket-name]
  (let [ticket-key (keyword ticket-name)]
    (if (keyword? ticket-key)
      (ticket-key (deref ticket-collection))
      nil)))

(defn -main
  [& args]
  (println "Hello, World!"))
