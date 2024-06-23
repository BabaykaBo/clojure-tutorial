(require '[clojure.repl :refer [doc]])

;; functions
(first [1 2 3 4])
((or + -) 1 2 3)

(map inc #{1 2 3 4 5})

(+ (inc 199) (/ 100 (- 7 2)))

;; defn
(defn too_enthusiastic
  "Return a cheer that might be a bit too enthusiastic"
  [name]
  (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
       "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

(too_enthusiastic "BOB")

;; docs
(doc too_enthusiastic)

;; arity overloading
(defn x-chop
  "Chop!!!"
  ([name chop]
   (str "I " chop " chop " name "! Take that!"))
  ([name]
   (x-chop name "karate")))

(x-chop "Pitun" "knife")
(x-chop "Pitun")

;; rest parameter
(defn sum-rest
  "Return map with first element as key and sum of rest elements as value"
  [fst & other]
  {fst (apply + other)})

(sum-rest 1 2 3 4 5 6 7)
(sum-rest 1)

;; Destructuring
(defn my-first
  "Get first element of vector/list"
  [[fst]]
  fst)

(my-first [1 2 3 4])
(my-first '(1 2 3 4))

;; Map Destructuring
(defn announce-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(announce-treasure-location {:lat 12.5 :lng 45.8})
(announce-treasure-location {:lattt 12.5 :lng 45.8})


(defn announce-treasure-location2
  [{:keys [lat lng]}] ;; shorter syntax -> lat associated with :lat and lng - with :lng
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(announce-treasure-location2 {:lat 12.5 :lng 45.8})
(announce-treasure-location2 {:lattt 12.5 :lng 45.8})
(announce-treasure-location2 {:lng 12.5 :lat 45.8})

(defn receive-treasure-location
  [{:keys [lat lng] :as treasure-location}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng))

  ;; One would assume that this would put in new coordinates for your ship
  (println treasure-location))

(receive-treasure-location {:lat 12.5 :lng 45.8})
