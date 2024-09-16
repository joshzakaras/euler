(ns euler.level1.problem011
  (:require
    [clojure.string :as str]))

(defn row-to-integers [row] (map #(Integer/valueOf %) row))

(defn string-to-2d-vector [string]
  (->> (str/split string #"\n")
       (map #(str/split % #" "))))

(defn format-grid [string]
  (if (empty? string)
    []
    (->> (string-to-2d-vector string)
         (map #(row-to-integers %)))))

(defn count-grid-columns [grid]
  (count (first grid)))

(defn columns-from-grid [grid]
  (if (empty? grid)
    []
    (->> (range (count-grid-columns grid))
         (map #(take-nth (count-grid-columns grid) (drop % (flatten grid)))))))

(defn format-diagonal [unformatted-diagonal]
  (->> (reverse unformatted-diagonal)
       (map-indexed vector)
       reverse
       (map #(nth (last %) (first %)))))

(defn second-half-of-diagonals [grid]
  (->> (map reverse grid)
       reverse
       (reductions conj [])
       rest
       (map format-diagonal)
       (drop-last)
       (map reverse)
       reverse))

(defn left-diagonals-from-grid [grid]
  (concat
    (map format-diagonal (rest (reductions conj [] grid)))
    (second-half-of-diagonals grid)
    ))

(defn right-diagonals-from-grid [grid]
  (->> (left-diagonals-from-grid (reverse grid))
       (map reverse)
       reverse))

(defn get-n-adjacent-from-set [n set]
  (mapcat #(partition n 1 %) set))

(defn euler-11 [n string]
  (let [grid (format-grid string)]
    (->> (conj [] grid (columns-from-grid grid) (left-diagonals-from-grid grid) (right-diagonals-from-grid grid))
         (mapcat #(get-n-adjacent-from-set n %))
         (map #(apply * %))
         (apply max))))