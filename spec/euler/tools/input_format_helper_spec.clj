(ns euler.tools.input-format-helper-spec
  (:require [speclj.core :refer :all]
            [euler.tools.input-format-helper :refer :all]))


(describe "A toolset to help with formatting inputs"

  (it "Generates a sequence of numbers given a string seperated by newlines"
    (should= [123 456 789] (string-to-number-sequence "123\n456\n789"))))