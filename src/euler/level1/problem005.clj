(ns euler.level1.problem005)

(defn divisible-by? [n x]
  (= 0 (rem n x)))

(defn euler-5 [n]
  (->> (iterate (partial + n) n)
       (filter #(let [n-divisible-by? (partial divisible-by? %)]
                  (every? n-divisible-by? (range 1 (inc n)))))
       first))
