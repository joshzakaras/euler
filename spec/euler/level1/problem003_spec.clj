(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143?

(describe "Euler Problem #3"

  (it "Checks if a number is prime"
      (should-not  (is-prime? 1))
      (should  (is-prime? 2))
      (should= true (is-prime? 3))
      (should= false (is-prime? 4))
      (should= true (is-prime? 5))
      (should= false (is-prime? 13195)))

  (it "Generates the factors of n"
      (should= [] (generate-factors 0))
      (should= [1] (generate-factors 1))
      (should= [1 2] (generate-factors 2))
      (should= [1 3] (generate-factors 3))
      (should= [1 2 4] (generate-factors 4))
      (should= [1 5] (generate-factors 5))
      (should= [1 2 5 10] (generate-factors 10))
      (should= [1 11] (generate-factors 11))
      (should= [1 2 4 5 10 20] (generate-factors 20))
      (should= [1 2 4 5 10 20 25 50 100] (generate-factors 100)))

  (it "Solves #3"
    (should= nil (euler-3 0))
    (should= 5 (euler-3 5))
    (should= 11 (euler-3 11))
    (should= 5 (euler-3 100))
    (should= 6857 (euler-3 600851475143))))

(run-specs)
