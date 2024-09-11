(ns euler.level1.problem007)


(defn first-odd-factor [n]
  (->> (iterate (partial + 2) 3)
       (take-while #(<= % n))
       (filter #(= 0 (rem n %)))
       first))

(defn prime? [n]
  (cond
    (<= n 1) false
    (= n 2) true
    (even? n) false
    :else (= n (first-odd-factor n))))

(defn euler-7 [n]
  (if (= n 1)
    2
    (nth (->> (iterate (partial + 2) 3)
              (filter prime?)) (- n 2))))
