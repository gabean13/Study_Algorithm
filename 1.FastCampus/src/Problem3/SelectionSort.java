package Problem3;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {50, 80, 70, 10, 60, 20, 40, 30};
        int minIndex;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
