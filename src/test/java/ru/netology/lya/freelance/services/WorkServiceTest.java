package ru.netology.lya.freelance.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkServiceTest {
    @Test
    void Test1() {
        WorkService service = new WorkService();
        int income = 10000;
        int expences = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = service.calcService(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test2() {
        WorkService service = new WorkService();
        int income = 100000;
        int expences = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = service.calcService(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

