(ns euler.tools.input-format-helper
  (:require [clojure.string :as str]))

(defn string-to-number-sequence [string]
  (->> (str/split string #"\n")
       (map read-string)))