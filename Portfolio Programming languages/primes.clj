(defn get-divisors[a] 
    (range 2 (inc (Math/floor (Math/sqrt a))))
)

(defn divides?[a b]
   (= (mod a b) 0)  
)

(defn no-divisors? [a]
     (= 
        (count 
            (filter 
                (partial divides? a) 
                (get-divisors a)
            )
        ) 
    0)
)

(defn is-prime?[a]
    (if(= a 1)
        false
    (if(= a 2)
        true
    (no-divisors? a)
    )
    )
)

(defn prime-seq[a b]
    (filter is-prime? (range a(inc b)))
)

  (println(prime-seq 50 100))
  (println)

(defn print-top-primes[a b] 
    (println (take-last 10 (prime-seq a b)))
    (println "Total:"(reduce + (take-last 10 (prime-seq a b))))
)   
    (println "get-divisors tests:") 
    (println (get-divisors 4))
    (println (get-divisors 101))
    (println (get-divisors 7))
    
    (println "divides? tests:")
    (println (divides? 10 2))
    (println (divides? 10 4))

    (println "no-divisors? tests:")
    (println (no-divisors? 9))
    (println (no-divisors? 7))

    (println "is-prime? tests:")
    (println(is-prime? 1))
    (println(is-prime? 2))
    (println(is-prime? 3))
    (println(is-prime? 4))
    (println(is-prime? 101))

    (println "print-top-primes tests:")
    (print-top-primes 50 100)
    (print-top-primes 7 11)