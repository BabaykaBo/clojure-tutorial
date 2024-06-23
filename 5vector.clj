;; vectors
[1 2 3]
(vector 1 2 3)

;; get values
(get [3 2 1] 0)
([1 2 3] 1)
;; (1 [1 2 3]) -> error

(get [1 2 3] 4)
;; ([1 2 3] 4) -> error: no such index

;; default values
(get ["a" "v" "c"] 4 "default")
;; (["a" "v" "c"] 4 "default") -> error

;; vector is immutable
(def a [1 2 3 4])
(conj a 5) ;; apend 
a

;; use commas
[1,2,3,4]

;; any types
(vector 1 1.0 true)

