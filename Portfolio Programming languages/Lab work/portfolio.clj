(defn get-divisors[a] 
    (range 2 (inc (Math/round (Math/sqrt a))) 1)
)

(println (get-divisors 9))

(defn divides?[a b]
    (= (mod b a) 0)
)

(println (divides? 2 10))


(defn no-divisors? [a]
   (=
    (count
        (drop 1
                (filter 
                    (fn [x]
                        (partial divides? a)
                    ) 
                        (get-divisors a)
                )
                
        )
    )
   0)
)


(println (no-divisors? 101))

(defn is-prime?[a]
    (if (= 1 a)
        true
        (if (= 2 a)
        false
        (no-divisors? a)
        )
    )
    
)

(println (is-prime? 101))