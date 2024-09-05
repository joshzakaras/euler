(ns euler.level1.problem006)

(defn square-of-sum-upto-n [n]
  (let [sum-upto-n (->> (range)
                        (take (inc n))
                        (apply +))]
    (* sum-upto-n sum-upto-n)))

  (defn sum-squares-upto-n [n]
    (->> (range)
         (take (inc n))
         (map #(* % %))
         (apply +)))

  (defn euler-6 [n]
    (- (square-of-sum-upto-n n) (sum-squares-upto-n n)))
