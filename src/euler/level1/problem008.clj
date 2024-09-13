(ns euler.level1.problem008)


(defn sequence-to-array [sequence]
  (map (comp read-string str) (str sequence))
  #_(map #(Character/digit % 10) (str sequence)))



(defn euler-8 [n sequence]
  (->> (sequence-to-array sequence)
       (partition n 1)
       (map #(apply * %))
       (apply max)))