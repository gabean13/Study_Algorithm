package Problem2;

public class BinarySearchProblem {
    public static void main(String[] args) {

        int[] nums = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int resultIndex = BSearchRecursive(nums, 83, 0, nums.length-1);
        System.out.println("83은 " + ((resultIndex != -1)? resultIndex + "에 저장되어있습니다": "존재하지 않습니다"));

        resultIndex = BSearchRecursive(nums, 88, 0, nums.length-1);
        System.out.println("88은 " + ((resultIndex != -1)? resultIndex + "에 저장되어있습니다": "존재하지 않습니다"));

    }

    public static int BSearchRecursive(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if(nums[mid] < target){
            return BSearchRecursive(nums, target, mid + 1, right);
        }else if(nums[mid] > target){
            return BSearchRecursive(nums, target, left, mid -1);
        }else{
            return mid;
        }
    }
}
