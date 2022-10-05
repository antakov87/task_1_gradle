package ru.netology.service;

import junit.framework.TestCase;
public class CashbackHackServiceTest extends TestCase {

    public void testRemainerOfThousand() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    public void testRemainderOfFiveHundred() {
        int amount = 500;
        int expected = 500;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    public void testRemainderFromZero() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    public void testRemain() {
        int amount = 12400;
        int expected = 600;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}