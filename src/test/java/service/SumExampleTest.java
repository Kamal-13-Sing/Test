package service;

import org.junit.Assert;
import org.junit.Test;

public class SumExampleTest {

    @Test
    public void sumTest(){

        int result = SumExample.sum(5,6);

        int expected = 11;

        Assert.assertEquals(expected, result);

    }

}
