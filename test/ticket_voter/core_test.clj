(ns ticket-voter.core-test
  (:require [clojure.test :refer :all]
            [ticket-voter.core :refer :all]))

(deftest ticket-value-test
  (testing "adds a single vote"
    (let [ticket-name "ABC-123"
          ticket-id (keyword ticket-name)
          ticket-vote 3]
      (is (= (ticket-id (hash-map ticket-id (list ticket-vote)))
             (ticket-id (add-ticket-vote ticket-name ticket-vote))))))

  (testing "allows duplicate values of votes"
    (let [ticket-name "ABC-234"
          ticket-id (keyword ticket-name)
          ticket-vote 2]
      (add-ticket-vote ticket-name ticket-vote)
      (is (= (ticket-id (hash-map ticket-id (list ticket-vote ticket-vote)))
             (ticket-id (add-ticket-vote ticket-name ticket-vote)))))))
