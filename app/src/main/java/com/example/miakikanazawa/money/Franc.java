package com.example.miakikanazawa.money;

/**
 * @author kanazawa
 */

public class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }


}
