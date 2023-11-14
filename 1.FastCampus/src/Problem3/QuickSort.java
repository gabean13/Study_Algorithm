package Problem3;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {50, 80, 70, 10, 60, 20, 40, 30};

        quickSort(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void quickSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivot = partition(nums, low, high);
        quickSort(nums, pivot + 1, high);
        quickSort(nums, low, pivot - 1);
    }

    private static int partition(int[] nums, int left, int right) {

        int pivot = nums[left];
        int low = left;
        int high = right;

        while (low < high) {
            while (nums[low] < pivot && low < high) {
                low++;
            }
            while (nums[high] > pivot && low < high) {
                high--;
            }
            swap(nums, low, high);
        }

        return low;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp;

        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }
}
