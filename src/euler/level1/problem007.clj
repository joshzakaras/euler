(ns euler.level1.problem007
  (:require
    [euler.tools.prime-helper :refer :all]))


(defn euler-7 [n]
  (-> (generate-primes)
      (nth (dec n))))