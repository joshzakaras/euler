(ns euler.tools.prime?-spec
  (:require [speclj.core :refer :all]
            [euler.tools.prime? :refer :all]))

(describe "Prime Number Checker"
          (it "Checks if a number is prime"
              (should-not (prime? 1))
              (should (prime? 2))
              (should-not (prime? 4))
              (should (prime? 5))
              (should-not (prime? 9))
              (should (prime? 11))
              (should (prime? 13))))