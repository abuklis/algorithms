package by.bsu.stringconverting.test;

import by.bsu.stringconverting.algorithm.Converter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anyab on 25.02.2017.
 */
public class ConverterTest {
    private String str1;
    private String str2;

    @Before
    public void setUp() throws Exception {
        str1 = "annabel";
        str2 = "hannibal";
    }

    @Test
    public void testEditDist() throws Exception {
        int expectedResult = 3;
        int actualResult = Converter.editDist(str1 , str2 , str1.length(), str2.length());
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        str1 = null;
        str2 = null;
    }
}