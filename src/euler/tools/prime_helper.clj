(ns euler.tools.prime-helper)

(defn potential-prime-factors [n]
  (->> (cons 2 (iterate (partial + 2) 3))
       (take-while #(<= (* % %) n))))

(defn prime? [n]
  (if (<= n 1)
    false
    (->> (potential-prime-factors n)
         (every? #(pos? (mod n %))))))

(defn generate-primes []
  (->> (iterate (partial + 2) 3)
       (cons 2)
       (filter prime?)))