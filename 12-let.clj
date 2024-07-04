(def x 0)
(let [x 1] x)

(let [y (inc x)] (into [] (list x y)))
