package com.example.miakikanazawa.money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author kanazawa
 */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(new Money.dollar(10), five.times(2));
        assertEquals(new Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Money.dollar(5).equals(new Money.dollar(5)));
        assertFalse(new Money.dollar(5).equals(new Money.dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(new Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}