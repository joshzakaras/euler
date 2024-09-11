(ns euler.level1.problem009)

(defn calculate-c [a b]
  (->> (+ (* a a) (* b b))
       Math/sqrt))

(defn pythagorean-triplets [n]
  (for [a (range 3 (inc (/ n 3)))
        :let [b (->> (range (inc a) (inc (/ n 2)))
                     (filter #(= 0.0 (- n(+ a % (calculate-c a %)))))
                     (filter #(not (nil? %)))
                     first)]
        :when (and (not (nil? b)))]
    [a b (int (calculate-c a b))]))

(defn euler-9 [n]
  (->> (pythagorean-triplets n)
       first
       (apply *)))
