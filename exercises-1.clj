(defn mapset
  [function collection]
  (set (map function collection)))

(mapset inc [1 1 2 2])


(def asym-creature-body-parts [
{:name "head" :size 3}
{:name "1-eye" :size 1}
{:name "1-ear" :size 1}
{:name "mouth" :size 1}
{:name "neck" :size 2}
{:name "1-shoulder" :size 2}
{:name "1-upper-arm" :size 3}
{:name "chest" :size 10}
{:name "back" :size 10}
{:name "1-forearm" :size 3}
{:name "abdomen" :size 6}
{:name "1-kidney" :size 1}
{:name "1-hand" :size 2}
{:name "1-knee" :size 2}
{:name "1-thigh" :size 4}
{:name "1-lower-leg" :size 3}
{:name "1-acilles" :size 1}
{:name "1-foot" :size 2}
])

(defn match-parts
  [part number]
  (if (re-find #"^1-" (:name part))
    (loop [iteration 2
           final-parts [part]]
      (if (> iteration number)
        final-parts
        (recur
         (inc iteration)
         (conj final-parts
               {:name (clojure.string/replace (:name part) #"^1-" (str iteration "-"))
                :size (:size part)}))))
    [part]))

(match-parts {:name "1-arm" :size 3} 5)
(match-parts {:name "head" :size 5} 6)

(defn better-symmetrize-body-parts
  [asym-body-parts number]
  (reduce
   #(into %1 (set (match-parts %2 number)))
   []
   asym-body-parts))

(better-symmetrize-body-parts asym-creature-body-parts 5)
(better-symmetrize-body-parts asym-creature-body-parts 3)
