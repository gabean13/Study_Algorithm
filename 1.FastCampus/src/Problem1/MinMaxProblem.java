package Problem1;

public class MinMaxProblem {

    public static void main(String[] args) {
        int[] nums = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
        int min = nums[0];
        int max = nums[0];
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                minIndex = i;
            }
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        System.out.println("minValue = " + min + "\tminIndex = " + minIndex);
        System.out.println("maxValue = " + max + "\tmaxIndex = " + maxIndex);
    }
}
