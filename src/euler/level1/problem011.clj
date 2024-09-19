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
    (let [number-of-columns (count-grid-columns grid)]
      (->> (range number-of-columns)
           (map #(take-nth number-of-columns (drop % (flatten grid))))))))

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
       drop-last))

(defn diagonals-from-grid [grid]
  (concat
    (map format-diagonal (rest (reductions conj [] grid)))
    (second-half-of-diagonals grid)
    ))

(defn get-n-adjacent-from-set [n set]
  (mapcat #(partition n 1 %) set))

(defn euler-11 [n string]
  (let [grid (format-grid string)
        left-diagonals (diagonals-from-grid grid)
        right-diagonals (->> grid reverse diagonals-from-grid)]
    (->> (conj [] grid (columns-from-grid grid) left-diagonals right-diagonals)
         (mapcat #(get-n-adjacent-from-set n %))
         (map #(apply * %))
         (apply max))))