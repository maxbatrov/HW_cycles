package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CountRestTest {

    @Test
    public void FirstCount() {
        RestService service = new RestService();

        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void SecondCount() {
        RestService service = new RestService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
