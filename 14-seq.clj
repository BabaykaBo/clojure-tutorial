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



