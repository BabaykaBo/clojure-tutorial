;; control flows
(if true
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if false
  "Hello")

(if true
  (do (print "Yes")
      "Yes")
  (do (print "No")
      "No"))

(when true
  (print 1)
  (print 2)
  3)

;; boolean
(= 1 2)
(= 1 1.0)


(true? 1)
(nil? nil)

(or 1 nil)
(or nil false 10)

(and true "a")
(and 1 "a" "true" 1.2 nil)