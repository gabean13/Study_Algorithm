package Problem3;

public class MergeSort {

    public static int []temp;
    public static void main(String[] args) {
        int[] nums = {50, 80, 70, 10, 60, 20, 40, 30};
        temp = new int[nums.length];

        mergeSort(nums, 0, nums.length - 1);

        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] nums, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            int leftIdx = left;
            int rightIdx = mid + 1;
            int idx = left;

            while(leftIdx <= mid || rightIdx <= right){
                //1. 첫번째 분할에서 원소를 가져오는 경우
                //1-1. 두번째 분할에서 원소를 다 가져온 경우
                //1-2. 첫번째 분할에서 가져오지 않은 원소가 있고 첫번째 분할의 원소값이 두번째 분할의 원소보다 작을 때
                if(rightIdx > right || (leftIdx <= mid && nums[leftIdx] < nums[rightIdx])){
                    temp[idx++] = nums[leftIdx++];
                }else{
                    temp[idx++] = nums[rightIdx++];
                }
            }

            for(int i = left; i <= right;i++){
                nums[i] = temp[i];
            }
        }
    }

}

