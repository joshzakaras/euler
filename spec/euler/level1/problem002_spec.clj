(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2



(describe "Euler Problem #2"

  (it "Generates n terms of the fibonacci sequence"
    (should= [1] (generate-n-fibonacci 1))
    (should= [1 2] (generate-n-fibonacci 2))
    (should= [1 2 3] (generate-n-fibonacci 3))
    (should= [1 2 3 5] (generate-n-fibonacci 4))
    (should= [1 2 3 5 8 13 21 34 55 89] (generate-n-fibonacci 10)))

  (it "Generates the fibonacci sequence until the next number would exceed n"
    (should= [1] (generate-fibonacci-upto-n 1))
    (should= [1 2] (generate-fibonacci-upto-n 2))
    (should= [1 2 3] (generate-fibonacci-upto-n 4))
    (should= [1 2 3 5 8 13 21 34 55 89] (generate-fibonacci-upto-n 89))
    (should= [1 2 3 5 8 13 21 34 55 89 144 233 377 610 987] (generate-fibonacci-upto-n 1000)))

  (it "Sums even fibonacci values that do not exceed n"
    (should= 0 (euler-2 1))
    (should= 2 (euler-2 2))
    (should= 2 (euler-2 5))
    (should= 4613732 (euler-2 4000000))))

(run-specs)
