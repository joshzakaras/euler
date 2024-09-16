(ns euler.level1.problem012)

(defn triangle-numbers
  ([] (triangle-numbers 1))
  ([n] (lazy-seq (cons (apply + (range 1 (inc n))) (triangle-numbers (inc n))))))

(defn factors-of-n [n]
  (->> (range 1 (inc n))
       (take-while #(<= (* % %) n))
       (filter #(zero? (rem n %)))
       (mapcat #(vector % (/ n %)))
       distinct
       sort))

(defn euler-12 [n]
  (->> (triangle-numbers)
       (filter #(> (count (factors-of-n %)) n))
       first))
