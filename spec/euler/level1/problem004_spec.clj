(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4
; A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
; 9009 = 91x99
;Find the largest palindrome made from the product of two 3-digit numbers.

(describe "Euler Problem #4"

  (it "Converts the digits of n into a vector"
    (should= [0] (digits 0))
    (should= [1] (digits 1))
    (should= [1 0] (digits 10))
    (should= [1 1] (digits 11))
    (should= [9 9] (digits 99))
    (should= [1 0 0] (digits 100))
    (should= [9 9 9] (digits 999))
    (should= [1 5 4 2 4] (digits 15424)))

  (it "Should check if a number is a palindrome"
    (should (is-palindrome? 0))
    (should-not (is-palindrome? 10))
    (should (is-palindrome? 11))
    (should (is-palindrome? 101))
    (should-not (is-palindrome? 1011))
    (should (is-palindrome? 1001)))

  (xit "Solves Euler 4"
    (should= -1 (euler-4 1))))


(run-specs)
