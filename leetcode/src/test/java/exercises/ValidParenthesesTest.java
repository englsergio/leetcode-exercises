package exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesTest {

    public static Object[][] getParameters() {
        return new Object[][] {
                {"()", true},
                {"()[]{}", true},
                {"(]", false},
                {"{)]}", false},
                {"{[]}", true},
                {"[", false},
                {"]", false}
        };
    }

    @DisplayName("Teste Parametrizado")
    @ParameterizedTest
    @MethodSource("getParameters")
    void isValidParameterizedTest(String input, boolean expectedValue) {
        assertEquals(expectedValue, ValidParentheses.isValid(input));
    }
}