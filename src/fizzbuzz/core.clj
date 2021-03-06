(ns fizzbuzz.core
  (:gen-class))

(defn fizz-buzz [n]
  (if-not (number? n)
    "Panicked!"
    (let [num (Long/valueOf n)]
      (cond
        (= (rem n 15) 0) "fizz-buzz"
        (= (rem n 3) 0) "fizz"
        (= (rem n 5) 0) "buzz"
        :else n))))

(defn -main [n]
  (println (fizz-buzz n)))
