(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143?

(describe "Euler Problem #3"

  (it "Solves #3"
    (should= -1 (euler-3 -1)))
  )

(run-specs)
