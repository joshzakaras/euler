(ns euler.level1.problem001-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem001 :refer :all]))

; http://projecteuler.net/index.php?section=problems&id=1

;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9.
;The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.

(describe "Euler Problem #1"

  (it "gets multiples of factor below n"
      (should= [] (multiples-of-n 0 3))
      (should= [] (multiples-of-n 3 3))
      (should= [3] (multiples-of-n 4 3))
      (should= [3] (multiples-of-n 5 3))
      (should= [3] (multiples-of-n 6 3))
      (should= [3 6] (multiples-of-n 7 3))
      (should= [3 6] (multiples-of-n 8 3))
      (should= [3 6] (multiples-of-n 9 3))
      (should= [3 6 9] (multiples-of-n 10 3))
      (should= [5] (multiples-of-n 10 5)))

  (it "Solves #1"
      (should= 0 (euler-1 3))
      (should= 3 (euler-1 5))
      (should= 8 (euler-1 6))
      (should= 23 (euler-1 10))
      (should= 60 (euler-1 16))
      (should= -1 (euler-1 1000)))
  )

(run-specs)
