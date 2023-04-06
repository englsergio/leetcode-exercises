package test;

import exercises.LongestCommonPrefix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    public static Object[][] getParameters() {
        return new Object[][]{
                {new String[]{"flower","flow","flight"}, "fl"},
                {new String[]{"a"}, "a"},
                {new String[]{"dog","racecar","car"}, ""},
                {new String[]{""}, ""},
                {new String[]{"", ""}, ""},
                {new String[]{"","b"}, ""},
                {new String[]{"flower","flower","flower","flower"}, "flower"}
        };
    }
    @DisplayName("Teste parametrizado")
    @ParameterizedTest
    @MethodSource("getParameters")
    void parameterizedTest(String[] strings, String expectedResult) {
        assertEquals(expectedResult ,LongestCommonPrefix.longestCommonPrefix2(strings));
    }
}
