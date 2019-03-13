(ns fizzbuzz.core-test
  (:require [clojure.test :as t]
            [fizzbuzz.core :as sut]))

(t/deftest fizzbuzz-test
  (t/testing "when you post multiple of 3, it says fizz"
    (t/is (= "fizz" (sut/fizz-buzz 3))))
  (t/testing "when you post multiple of 5, it says buzz"
    (t/is (= "buzz" (sut/fizz-buzz 5))))
  (t/testing "when you post multiple of 15, it says fizz-buzz"
    (t/is (= "fizz-buzz" (sut/fizz-buzz 15))))
  (t/testing "when you post non-multiple of 3,5,15, it says yournum"
    (t/is (= 2 (sut/fizz-buzz 2)))))

(t/deftest fizzbuzz-test-irregular-case
  (t/testing "when you get not-number, it says Panicked"
    (t/is (= "Panicked!" (sut/fizz-buzz "hoge")))))
