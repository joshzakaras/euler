(ns euler.level1.problem014-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem014 :refer :all]))

; https://projecteuler.net/problem=14
; The following iterative sequence is defined for the set of positive integers:
; n-> n/2 when n is even
; n-> 3n + 1 when n is odd
; using the rule above and starting with 13, we generate the following sequence:
; 13->40->20->10->5->16->8->4->2->1
; It can be seen that this sequence contains 10 terms. Although it has not been proven yet,
; it is thought that all starting numbers finish at 1.
; Which starting number, under one million, produces the longest chain?
; NOTE: Once the chain starts the terms are allowed to go above one million.

(describe "Euler Problem #14"

  (it "Generates a sequence using the rules described above starting at n"
    (should= [1] (collatz-sequence 1))
    (should= [2 1] (collatz-sequence 2))
    (should= [4 2 1] (collatz-sequence 4))
    (should= [5 16 8 4 2 1] (collatz-sequence 5)))

    (it "Generates the collatz sequence with the largest chain where the starting number is less than n"
      (should= [9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1] (largest-collatz-under-n 14)))

  (it "Finds the starting number under n that producest the largest collatz chain"
    (should= 9 (euler-14 14))
    (should= 837799 (euler-14 1000000))))

(run-specs)
