package test;

import exercises.Sum3Sum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum3SumTest {

    @Test
    void test() {
        int[] nums = {-1, 0, 1, 2 -1, -4};
        List<List<Integer>> actualResult = Sum3Sum.threeSum(nums);
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>(Arrays.asList(-1, 0, 1)));

        assertEquals(expectedResult, actualResult);
    }
}
