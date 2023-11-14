package Problem3;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {50, 80, 70, 10, 60, 20, 40, 30};
        int key;

        for (int i = 1; i < nums.length; i++) {
            key = nums[i];
            int j = i - 1;
            while(j >= 0){
                //key가 비교값보다 크면 비교 멈춤
                if(nums[j] < key){
                    break;
                }
                nums[j+1] = nums[j];
                j--;
            }
            nums[j + 1] = key;

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
