;; Author Sony? aka Sawny (4morefun.net)


;; Argument helper
(defn arg
    "Returns argument i."
    {:author "Sony? aka Sawny"}

    ([]
        *command-line-args*)

    ([n]
        (nth *command-line-args* (dec n) nil))

    ([n errorMsg]
        (if (nil? (nth *command-line-args* (dec n) nil))
            (do
                (println errorMsg)
                (System/exit 0))
            (nth *command-line-args* (dec n)))))


;; To-int; Conver string to int.
(defn to-int [i]
    (Integer. (re-find #"\d+" i)))



;;;;;;;;;;;;;;;
;;; Aliases ;;;
;;;;;;;;;;;;;;;


;; PI
(def PI
    (Math/PI))

;;Args
(def args *command-line-args*)
