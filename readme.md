Easy clojure!
=============

How to use
----------

    1. Copy the file easy-coljure.clj to your computer
    2. Load it with (load-file "./path/to/easy-clojure.clj")
    3. Done! :)

Functions:
----------

###arg##
`arg i`
`arg i errMsg`

Returns argument i or nil if not set.
Returns argument i or exit program and print errMsg if not set.

**Example**

    (println (arg 1)) ;; Equal to (println (nth *command-line-args* 0)) ;; Note the 1 and 0.



    file.clj
    (println (arg 2 "You need to enter arg 2!"))
    (println (arg 1))

    => file.clj Sony? wazzup
    wazzup
    Sony?

    => file.clj hello
    You need to enter arg 2!