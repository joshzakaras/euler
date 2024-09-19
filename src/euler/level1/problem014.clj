(ns euler.level1.problem014)

(defn collatz-sequence [n]
  (cond
    (= n 1) [1]
    (even? n) (cons n (collatz-sequence (/ n 2)))
    :else (cons n (collatz-sequence (inc (* n 3))))))

(defn largest-collatz-under-n [n]
  (->> (range 1 n)
       (map collatz-sequence)
       (apply max-key count)))

(defn euler-14 [n]
  (->> (largest-collatz-under-n n)
       first))
