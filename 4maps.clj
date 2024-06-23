;; maps
{}
{:first 1 :second 2}
{"plus" +}
{+ 12}

;; types of map
(hash-map :a 1 :b 2)
(sorted-map :c 2 :a 4 :v 3 :b 2)

;; nested map
{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}

;; get value
(get {:a 0 :b 1} :b) ;; function `get`
({:a 0 :b 1} :b)     ;; map {:a 1} as a function
(:b {:a 0 :b 1})     ;; keyword `:b` as a function

;; get nil
(get {} :b)
({} :b)
(:b {})

;; difference
(get nil :b)
(:b nil) ;; (:b nil) == (get nil :b)
;; (nil :b) -> error



;; default value
(get {:a 1} :b 2) 
({:a 1} :b 2)     
(:b {:a 1} 2)

;; get nested value
(get-in {:a 0 :b {:c "ho hum"}} [:b :c])
(get-in {:a 0 :b {:c "ho hum"}} [:b :a])
(get-in {:a 0 :b {:c "ho hum"}} [:b :a] "default")

;; other types as keys
(get {"a" 1} "a")
({"a" 1} "a")
;; ("a" {"a" 1}) -> error - you cannot use "a" as a function; only keywords for map

({"a" 1} "b" 2)
;; ("b" {"a" 1}  2) -> error

;; you can use `,`
{"a" 1, "v" 1/2, :d true}
