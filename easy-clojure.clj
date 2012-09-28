;; Author Sony? aka Sawny (4morefun.net)


(defn arg
    "Returns argument i."
    {:author "Sony? aka Sawny"}

    ([n]
        (nth *command-line-args* (dec n) nil))
    ([n errorMsg]
        (if (nil? (nth *command-line-args* (dec n) nil))
            (do
                (println errorMsg)
                (System/exit 0))
            (nth *command-line-args* (dec n)))))