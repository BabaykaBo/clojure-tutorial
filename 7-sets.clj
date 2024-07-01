;; sets
#{ 1 2 :a [1 2 3]}
;; #{1 2 :a [1 2 3] 2} error: duplicates 

;; types
(hash-set 1 4 5 3 2 3)
(sorted-set 3 2 1 3)

;; add values
(conj #{:a :b} :c)
(conj #{:a :b} :b) ;; no duplicates

;; add values
(def a #{ 2 1 3 4 5})
a
(conj a  6)
a ;; immutabe

;; get values
(get #{1 2 3} 3)
(#{1 2 3} 3)
;; (3 #{1 2 3}) -> error
(#{1 2 3} 4)

(get #{1 2 :a} :a)
(#{1 2 :a} :a)
(:a #{1 2 :a}) ;; no error `cause it is keyword

(get #{1 2 :a} :b)
(#{1 2 :a} :b)
(:a #{1 2 :b})

(get nil :b)
(:b nil)
;; (nil :b) -> error

;; default value
(get #{1 2 :a} :b 34)
;;(#{1 2 :a} :b 34) -> error
(:a #{1 2 :b} 34)

(get #{1 2 3} 4 34)
;;(#{1 2 3} 4 34) -> error
;; (3 #{1 2 3} 34) -> error

;; contains
(contains? #{:a :b} :a) ;;true

(contains? #{:a :b} 3) ;; false

(contains? #{nil} nil) ;; true
