package Problem3;

public class HeapSort {

    public static void main(String[] args) {
        int[] nums = {50, 80, 70, 10, 60, 20, 40, 30};

        heapSort(nums);

        for(int num:nums){
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public static void heapSort(int []nums){
        int size = nums.length;

        for(int i = 0; i < nums.length; i++){
            //maxHeap
            for(int j = 0; j < size / 2 ; j++){
                heapfiy(nums, j, size);
            }
            //루트와 마지막 노드 교환
            swap(nums, 0, --size);
        }


    }

    //힙을 만드는 함수
    public static void heapfiy(int []nums, int parentIndex, int size){
        int parent = parentIndex;
        int leftChild = 2*parent + 1;
        int rightChild = 2*parent + 2;

        //좌측 자식이 부모보다 크면 부모 인덱스를 leftChild로 바꿈
        if(leftChild < size && nums[leftChild] > nums[parent]){
            parent = leftChild;
        }
        //우측 자식이 부모보다 크면 부모 인덱스를 rightChild로 바꿈
        if(rightChild < size && nums[rightChild] > nums[parent]){
            parent = rightChild;
        }

        //부모와 자식이 바뀌었으면 swap처리 및 교환된 자식 노드를 부모노드로 삼은 서브트리를 heap 재 검사
        if(parentIndex != parent){
            swap(nums, parentIndex, parent);
            heapfiy(nums, parent, size);
        }

    }

    public static void swap(int []nums, int a, int b){

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }


}
