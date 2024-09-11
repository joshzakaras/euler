(ns euler.level1.problem007
  (:require
    [euler.tools.prime? :refer :all]))

(defn euler-7 [n]
  (if (= n 1)
    2
    (nth (->> (iterate (partial + 2) 3)
              (filter prime?)) (- n 2))))
