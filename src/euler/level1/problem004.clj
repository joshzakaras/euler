(ns euler.level1.problem004)

(defn palindrome? [n]
  (= (str n) (apply str (reverse (str n)))))

(defn euler-4 [n]
  (let [n-digit-numbers (->> (range (Math/pow 10 (dec n)) (Math/pow 10 n))
                             (map int))]
    (->> (for [x n-digit-numbers
               y n-digit-numbers]
           (* x y))
         (filter palindrome?)
         sort
         last)))