(ns euler.level1.problem010
  (:require
    [euler.tools.prime? :refer :all]))

(defn primes-below-n [n]
  (->> (cons 2
             (for [x (iterate inc 3)
                   :when (prime? x)]
               x))
       (take-while #(< % n))))

(defn euler-10 [n]
  (apply + (primes-below-n n)))
