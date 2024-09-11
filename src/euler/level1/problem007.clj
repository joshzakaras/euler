(ns euler.level1.problem007)


(defn potential-factors [n]
  (->> (cons 2 (iterate (partial + 2) 3))
       (take-while #(<= (* % %) n))))

(defn prime? [n]
  (if (<= n 1)
    false
    (->> (potential-factors n)
         (every? #(pos? (mod n %))))))

(defn euler-7 [n]
  (if (= n 1)
    2
    (nth (->> (iterate (partial + 2) 3)
              (filter prime?)) (- n 2))))
