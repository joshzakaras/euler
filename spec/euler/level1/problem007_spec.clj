(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7
; By listing the first six prime numbers: 2, 3, 5, 7, 11, 13, we can see that the 6th prime is 13.
; What is the 10001st prime number

(describe "Euler Problem #7"

  (it "Generates the nth prime number"
    (should= 2 (euler-7 1))
    (should= 3 (euler-7 2))
    (should= 5 (euler-7 3))
    (should= 13 (euler-7 6))
    (should= 541 (euler-7 100))
    (should= 104743 (euler-7 10001)))
  )

(run-specs)
