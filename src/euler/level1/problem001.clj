(ns euler.level1.problem001)

(defn multiples-of-n [n factor]
  (filter #(= 0 (rem % factor)) (range 1 n)))

(defn euler-1 [n]
  (let [multiples (set (mapcat #(multiples-of-n n %) [3 5]))]
    (apply + multiples)))
