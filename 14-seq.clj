;; map
(map str [1 2 3])
(map str [1 2 3] ["a" "b" "c"])

(def human-consumption [8.1 7.3 6.6 5.0])
(def critter-consumption [0.0 0.1 0.3 1.1])
(defn unify-diet-data
  [human critter]
  {:human human
   :critter critter})

(map unify-diet-data human-consumption critter-consumption)

(defn stats
  [numbers]
  (map #(apply % numbers) [+ - * /]))
(stats [1 2 3 4])


;; reduce
(reduce (fn [new-map [key val]]
          (assoc new-map key (inc val)))
        {}
        {:min 10 :max 30})


;; take and drop
(take 3 '(1 2 3 4 5 6))
(drop 3 [1 2 3 4 5 6])

;; take-while and drop-while
(take-while #(> % 2) [3 4 5 6 5 4 2 2]) 
(drop-while #(> % 2) [3 4 5 4 3 2 1 2 1 0 1])

;; filter
(filter #(< % 3) [2 3 4 1 3 4 0 -1 3 2 5 6])
 
;; some
(some #(> % 4) [1 2 3 2 1 2])
(some #(> % 2) [1 2 3 2 1 2])

;; sort and sort-by
(sort '(\d \v \a \b \c))
(sort-by count ["as" "cvf" "" "xcdse"])

(concat [1 2] [3 4])