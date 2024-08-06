package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CountRestTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/param.csv")
    public void FirstCount(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
    
}
