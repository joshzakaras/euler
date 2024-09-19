(ns euler.level1.problem001)

(defn multiples-under-n [n factor]
  (filter #(zero? (rem % factor)) (range 1 n)))

(defn euler-1 [n]
  (let [multiples (set (mapcat #(multiples-under-n n %) [3 5]))]
    (apply + multiples)))
