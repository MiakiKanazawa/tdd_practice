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
        assertTrue(new Money.franc(5).equals(new Money.franc(5)));
        assertFalse(new Money.franc(5).equals(new Money.franc(6)));
        assertFalse(new Money.franc(5).equals(new Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = new Money.franc(5);
        assertEquals(new Money.franc(10), five.times(2));
        assertEquals(new Money.franc(15), five.times(3));
    }
}