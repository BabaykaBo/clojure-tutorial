;; fn
(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])

((fn [x] (* x 3)) 8)
(#(* % 3) 8) ;; reader macros

;; several args
(#(str %1 " and " %2) "cornbread" "butter beans")

;; rest parameter
(#(identity %&) 1 "blarg" :yip)


;; examples
((fn
   [ls]
   (get (vec ls) (- (count (vec ls)) 1))) '(1 2 3))

(reduce (fn [_ x] x) #{1 2 3})

((fn
   [ls]
   (get (vec ls) (- (count (vec ls)) 2))) '(1 2 3))

(#(second (reverse %)) #{ 1 2 3 4})
