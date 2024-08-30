(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4
; A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
; 9009 = 91x99
;Find the largest palindrome made from the product of two 3-digit numbers.

(describe "Euler Problem #4"

  (it "Checks if a number is a palindrome"
    (should (palindrome? 1))
    (should-not (palindrome? 10))
    (should (palindrome? 11))
    (should (palindrome? 101))
    (should (palindrome? 9009)))

  (it "Finds the largest palindrome made from the product of two n-digit numbers"
    (should= 9 (euler-4 1))
    (should= 9009 (euler-4 2))
    (should= 906609 (euler-4 3))))


(run-specs)
