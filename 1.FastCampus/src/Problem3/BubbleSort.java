package Problem3;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {50, 80, 70, 10, 60, 20, 40, 30};
        int temp;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] < nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i = 0;i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
