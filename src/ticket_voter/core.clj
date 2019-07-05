(ns ticket-voter.core
  (:gen-class))

(def ticket-collection (atom (hash-map)))

(defn add-ticket-vote
  "Assigns given vote to the user-name and adds it to the list assigned to ticket-name keyword."
  [ticket-name user-name vote]
  (let [ticket-key (keyword ticket-name)]
    (swap! ticket-collection update-in [ticket-key]
           #(assoc-in % [(keyword user-name)] vote))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
