;(println (+ (* 2 3) (/ (+ 2 (* 2 3)) 4)))
(defn predict-balance[a b c]
    (println (* a (Math/pow (+ 1 b) c)))
)

(predict-balance 300 0.005 10)

(defn year-to-target[a b c]
    (println (Math/round (/ (- (Math/log b) (Math/log a)) (Math/log (+ 1 c)))))
)

(year-to-target 300 400 0.005)

(defn target-years[a b c] 
    
    
   (def years (Math/round (/ (- (Math/log b) (Math/log a)) (Math/log (+ 1 c)))))
   (println years)
  
  
   (println (range (+ 1 years)))


)

(target-years 100 105 0.005)