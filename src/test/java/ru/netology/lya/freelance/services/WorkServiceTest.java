package ru.netology.lya.freelance.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkServiceTest {
    // @Test
    // public void Test1() {
    // WorkService service = new WorkService();
    // int income = 10000;
    // int expences = 3000;
    // int threshold = 20000;
    // int expected = 3;
    //  int actual = service.calcService(income, expences, threshold);
    //  Assertions.assertEquals(expected, actual);
    //  }

    //@Test
    //public void Test2() {
    //WorkService service = new WorkService();
    // int income = 100000;
    //int expences = 60000;
    //int threshold = 150000;
    //int expected = 2;
    //int actual = service.calcService(income, expences, threshold);

    //Assertions.assertEquals(expected, actual);
    //}
//}

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"

    })
    public void Test3(int expected, int income, int expences, int threshold) {
        WorkService service = new WorkService();
        int actual = service.calcService(income, expences, threshold);
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/work.csv")
    public void Test4(int expected, int income, int expences, int threshold) {
        WorkService service = new WorkService();
        int actual = service.calcService(income, expences, threshold);
        Assertions.assertEquals(expected, actual);

    }
}