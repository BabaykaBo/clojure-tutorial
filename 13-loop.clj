(loop [it 0]
  (if (> it 3)
    (println "Bye")
    (do (println it)
        (recur (inc it)))))
