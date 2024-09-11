(ns euler.tools.prime?)

(defn potential-factors [n]
  (->> (cons 2 (iterate (partial + 2) 3))
       (take-while #(<= (* % %) n))))

(defn prime? [n]
  (if (<= n 1)
    false
    (->> (potential-factors n)
         (every? #(pos? (mod n %))))))