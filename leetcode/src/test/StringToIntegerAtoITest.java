package src.test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static src.exercises.StringToIntegerAtoI.myAtoi;

public class StringToIntegerAtoITest {
    @Test
    void teste1(){
        String s = "42";
        int expectedResult = 42;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste2(){
        String s = "   -42";
        int expectedResult = -42;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste3(){
        String s = "4193 with words";
        int expectedResult = 4193;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste4_positiveOverflow(){
        String s = "2147483923";
        int expectedResult = Integer.MAX_VALUE;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste4_negativeOverflow(){
        String s = "-2147483923";
        int expectedResult = Integer.MIN_VALUE;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste5_lettersBeforeNumber(){
        String s = "words and 987";
        int expectedResult = 0;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste6_lettersBeforeNumber(){
        String s = "3.14159";
        int expectedResult = 3;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste7_twoSigns(){
        String s = "+-12";
        int expectedResult = 0;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste8_zerosBeforeSign(){
        String s = "00000-42a1234";
        int expectedResult = 0;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste9_leadingZerosTotalNumberExceding10(){
        String s = "  0000000000012345678";
        int expectedResult = 12345678;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste10() {
        String s = "-000000000000000000000000000000000000000000000000001";
        int expectedResult = -1;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    void teste11() {
        String s = "2147483646";
        int expectedResult = 2147483646;
        int actualResult = myAtoi(s);

        assertEquals(expectedResult, actualResult);
    }
}
