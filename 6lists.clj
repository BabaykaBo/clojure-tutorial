;; lists
'(1 2 3 4)
(list 1 2 3 4)

;; get value by index with `nth`
(nth '("a" "b" "c") 0)
;; ('("a" "b" "c") 0) -> error

;; (nth '("a" "b" "c") 4) -> error: index out of bound
(nth '("a" "b" "c") 4 "default") ;; can set default value

;; add value
(def a (list 1 2 3))
a
(conj a 4) ;; prepend
a ;; immutable

;; any types
[1 1.2 1/2 true "a" '(1 2 3)]

