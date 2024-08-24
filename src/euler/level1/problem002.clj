(ns euler.level1.problem002)

(defn generate-n-fibonacci [n]
  (cond
    (= n 1) [1]
    (= n 2) [1 2]
    (>= n 3) (let [leading-fibonacci (generate-n-fibonacci (dec n))]
              (conj leading-fibonacci (+ (nth leading-fibonacci (- n 3)) (last leading-fibonacci))))))

(defn generate-fibonacci-upto-n [n]
  (loop [iter 1]
    (let [generated-sequence (generate-n-fibonacci iter)]
      (if (> (last generated-sequence) n)
           (drop-last generated-sequence)
            (recur (inc iter))))))

(defn euler-2 [n]
  (let [even-fibonacci (filter #(even? %) (generate-fibonacci-upto-n n))]
    (apply + even-fibonacci)))