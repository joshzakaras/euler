(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6
; The sum of the squares of the first ten natural numbers is
; 1^2 + 2^2 + ... + 10^2 = 385.
; The square of the sum of the first ten natural numbers is,
; (1 + 2 + ... + 10)^2 = 55^2 = 3025
; Hence the difference between the sum of the squares of the
; first ten natural numbers and the square of the sum is
; (3025 - 385) = 2640.
; Find the difference between the sum of the squares of the first
; one hundred natural numbers and the square of the sum

(describe "Euler Problem #6"

  (it "Generates the sum of the squares of the first n natural numbers"
    (should= 1 (sum-squares-upto-n 1))
    (should= 5 (sum-squares-upto-n 2))
    (should= 385 (sum-squares-upto-n 10)))

  (it "Generates the square of the sum of the first n natural numbers"
    (should= 1 (square-of-sum-upto-n 1))
    (should= 9 (square-of-sum-upto-n 2))
    (should= 3025 (square-of-sum-upto-n 10)))

  (it "Finds the difference between the sum of squares and the square of the sum of the first n natural numbers"
    (should= 0 (euler-6 1))
    (should= 4 (euler-6 2))
    (should= 2640 (euler-6 10))
    (should= 25164150 (euler-6 100)))
  )

(run-specs)
