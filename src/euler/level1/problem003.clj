(ns euler.level1.problem003)

 (defn is-prime? [n]
   (cond
     (<= n 1) false
     (= n 2) true
     :else (loop [factor 2]
             (if (= factor n)
               true
               (if (or (= 0 (rem n factor)))
                 false
                 (recur (inc factor)))))))

(defn floor-is-2? [n factor bottom-result]
  (= (Math/floor (/ n 2)) factor))

(defn generate-factors [n]
  (cond
    (< n 1) []
    (= n 1) [1]
    (= n 2) [1 2]
    (= n 3) [1 3]
    (= n 4) [1 2 4]
    :else (loop [factor 2
                   bottom-result [1]
                   top-result (list n)]
              (cond
                (floor-is-2? n factor bottom-result) (concat bottom-result top-result)
                (= (/ n factor) factor) (concat bottom-result (conj top-result factor))
                (some #(= (/ n factor) %) bottom-result) (concat bottom-result top-result)
                (= 0 (rem n factor)) (recur (inc factor) (conj bottom-result factor) (conj top-result (/ n factor)))
                :else (recur (inc factor) bottom-result top-result)))))

  (defn euler-3 [n]
    (last (filter #(is-prime? %) (generate-factors n))))