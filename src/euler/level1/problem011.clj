(ns euler.level1.problem011
  (:require [clojure.string :as str]))

(defn formatGrid [grid]
  (for [row (map #(str/split % #" ") grid)]
    (map #(Integer/valueOf %) row)))

(defn calculateGridDimensions [grid]
  {:x (count (first grid)) :y (count grid)})

(defn getColumns [grid]
  (let [gridDimensions (calculateGridDimensions (formatGrid grid))]
    (for [y (range 0 (get gridDimensions :y))]
      (take-nth (get gridDimensions :y) (drop y (flatten (formatGrid grid)))))))

(defn getRows [grid]
  (let [gridDimensions (calculateGridDimensions (formatGrid grid))]
    (->> (formatGrid grid)
         flatten
         (partition (get gridDimensions :x)))))

(defn getLeftDiagonals [grid]
  (let [formattedGrid (formatGrid grid)]
    (let [gridDimensions (calculateGridDimensions formattedGrid)]
      (concat
        (for [row (reverse (range 1 (inc (get gridDimensions :y))))]
          (->> (range row)
               (map #(nth (nth formattedGrid %) (Math/abs (- % (dec row)))))))
        (for [column (reverse (range 1 (get gridDimensions :x)))]
          (->> (range column)
               (map #(nth (nth formattedGrid (- (dec (get gridDimensions :x)) (Math/abs (- % (dec column))))) (- (dec (get gridDimensions :x)) %)))))))))

(defn getRightDiagonals [grid]
  (let [formattedGrid (map reverse (formatGrid grid))]
    (let [gridDimensions (calculateGridDimensions formattedGrid)]
      (concat
        (for [row (reverse (range 1 (inc (get gridDimensions :y))))]
          (->> (range row)
               (map #(nth (nth formattedGrid %) (Math/abs (- % (dec row)))))))
        (for [column (reverse (range 1 (get gridDimensions :x)))]
          (->> (range column)
               (map #(nth (nth formattedGrid (- (dec (get gridDimensions :x)) (Math/abs (- % (dec column))))) (- (dec (get gridDimensions :x)) %)))))))))

(defn greatestProductInSet [n set]
  (->> (mapcat #(partition n 1 %) set)
       (map #(reduce * %))
       (apply max)))

(defn euler-11 [n grid]
  (->> (map #(greatestProductInSet n %) [(getRows grid) (getColumns grid) (getLeftDiagonals grid) (getRightDiagonals grid)])
       (apply max)))