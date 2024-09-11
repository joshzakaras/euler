(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9
; A Pythagorean triplet is a set of three natural numbers, a<b<c, for which,
; a^2 + b^2 = c^2
;For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2
; There exists exactly one Pythagorean triplet for which a+b+c=1000.
; Find the product abc.

(describe "Euler Problem #9"

  (it "Finds the pythagorean triplets for which a+b+c=n"
    (should= [] (pythagorean-triplets 0))
    (should= [[3 4 5]] (pythagorean-triplets (+ 3 4 5)))
    (should= [[5 12 13]] (pythagorean-triplets (+ 5 12 13))))

  (it "Finds the product of a pythagorean triplet for which a+b+c=n"
    (should= 60 (euler-9 12))
    (should= (* 5 12 13) (euler-9 (+ 5 12 13)))
    (should= 31875000 (euler-9 1000)))
  )

(run-specs)
