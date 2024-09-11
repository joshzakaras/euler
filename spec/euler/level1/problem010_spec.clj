(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10
; The sum of primes below 10 is 2+3+5+7=17
; Find the sum of all the primes below two million

(describe "Euler Problem #10"

  (it "Creates a list of primes below n"
    (should= [] (primes-below-n 2))
    (should= [2] (primes-below-n 3))
    (should= [2 3] (primes-below-n 4))
    (should= [2 3 5] (primes-below-n 6))
    (should= [2 3 5 7] (primes-below-n 10))
    (should= [2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97] (primes-below-n 100)))

  (it "Finds the sum of all the primes below n"
    (should= 17 (euler-10 10))
    (should= 454396537 (euler-10 100000))
    (should= 142913828922 (euler-10 2000000))
    ))

(run-specs)
