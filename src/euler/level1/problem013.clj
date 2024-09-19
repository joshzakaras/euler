(ns euler.level1.problem013
  (:require
    [euler.tools.input-format-helper :refer :all]))

(defn array-sum [array]
  (apply + array))


(defn euler-13 [n string]
  (-> (string-to-number-sequence string)
      (array-sum)
      str
      (subs 0 n)
      read-string))
