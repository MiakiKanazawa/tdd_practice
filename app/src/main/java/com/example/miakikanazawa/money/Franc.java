package com.example.miakikanazawa.money;

/**
 * @author kanazawa
 */

class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier, currency);
    }


}
