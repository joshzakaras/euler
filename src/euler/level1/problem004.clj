(ns euler.level1.problem004)

(defn digits [n]
  (if (< n 10) [n] (concat (digits (quot n 10)) [(mod n 10)])))

(defn is-palindrome? [n]
  (cond
    (< n 10) true
    (< n 1000) (= (first (digits n)) (last (digits n)))
    :else false))

(defn euler-4 [n])

