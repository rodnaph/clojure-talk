
(ns clojure-talk.sequences)

(def numbers '[1 1 2 3 5 8 13])

; // double numbers
; var $numbers = [ 1, 1, 2, 3, 5, 8, 13 ];
; for ( var $i=0; i<$numbers.length; $i++ ) {
;   $numbers[ i ] = $numbers[ i ] * 2;
; }



; // work out some kind of total
; var total = 0;
; foreach ( $number in $numbers ) {
;   $total += $number;
; }


; // filter to a subset of data
; var $oddNumbers = array();
; foreach ( $number in $numbers ) {
;   if ( $number % 2 ) {
;     $oddNumbers.push( $number );
;   }
; }

(defn odd [x] (> (mod x 2) 0))

