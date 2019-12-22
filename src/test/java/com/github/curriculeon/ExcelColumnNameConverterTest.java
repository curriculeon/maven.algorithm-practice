package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/22/2019.
 */
public class ExcelColumnNameConverterTest {
    // given
    private void test(String columnName, Integer expectedValue) {
        ExcelColumnNameConverter converter = new ExcelColumnNameConverter();

        // when
        Integer actualValue = converter.toNumber(columnName);

        // then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void test1() {
        test("A", 1);
    }

    @Test
    public void test2() {
        test("B", 2);
    }


    @Test
    public void test3() {
        test("C", 3);
    }

    @Test
    public void test4() {
        test("Z", 26);
    }

    @Test
    public void test5() {
        test("Y", 25);
    }

    @Test
    public void test6() {
        test("X", 24);
    }


    @Test
    public void test7() {
        test("AA", 27);
    }

    @Test
    public void test8() {
        test("AB", 28);
    }


    @Test
    public void test9() {
        test("AC", 29);
    }

    @Test
    public void test10() {
        test("ZZZZ", 475254);
    }

    @Test
    public void test11() {
        test("ZZZY", 475253);
    }

    @Test
    public void test12() {
        test("ZZZX", 475252);
    }


}
