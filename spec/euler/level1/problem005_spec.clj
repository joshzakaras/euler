(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5
; 2520 is the smallest number that can be divided by each of the numbers
; from 1 to 10 without any remainder. What is the smallest positive number that
; is evenly divisible by all of the numbers from 1 to 20.

(describe "Euler Problem #5"

  (it "Checks if a number n is divisible by x"
    (should (divisible-by? 1 1))
    (should-not (divisible-by? 3 2))
    (should (divisible-by? 4 2)))

  (it "Provides the smallest positive number that is divisible by all of the numbers from 1 to n"
    (should= 1 (euler-5 1))
    (should= 2 (euler-5 2))
    (should= 6 (euler-5 3))
    (should= 12 (euler-5 4))
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20)))
  )

(run-specs)
