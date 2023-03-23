package src.exercises;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, temp = 0, max = 0;
        while (left < right) {
            temp = (right - left) * Math.min(height[right], height[left]);
            if(temp > max) max = temp;
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
