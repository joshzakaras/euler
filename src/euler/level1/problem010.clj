(ns euler.level1.problem010
  (:require
    [euler.tools.prime-helper :refer :all]))

(defn primes-below-n [n]
  (->> (generate-primes)
       (take-while #(< % n))))

(defn euler-10 [n]
  (apply + (primes-below-n n)))