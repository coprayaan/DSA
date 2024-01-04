package algorithms.sorting_strategy;

import utilities.ListUtilities;

import java.util.List;

public class HeapSortingStrategy implements ISortingStrategy {
    public ListUtilities<Integer> utilities;
    public HeapSortingStrategy(){
        utilities = new ListUtilities<>();
    }
    @Override
    public void sort(List<Integer> nums) {
        // Tqking the length of the list or array
        int length = nums.size();

        // Building a max-heap
        for (int curr_ele = (2 * length) - 1; curr_ele > 0 ; curr_ele--) {
            heapify(nums, length, curr_ele);
        }

        // Swapping the last element with root and redoing max-heap
        for (int i  = length - 1; i > 0 ;i--) {
            utilities.swapItems(nums, 0 , i);
            heapify(nums, i, 0 );
        }
    }
    private void heapify(List<Integer> nums, int length, int curr_ele){
        int largest_num = curr_ele;
        int left_node = 2 * curr_ele + 1;
        int rigth_node = 2* curr_ele + 2;

        if(left_node < length && nums.get(left_node) > nums.get(largest_num)){
            largest_num = left_node;
        }
        if(rigth_node < length && nums.get(rigth_node) > nums.get(largest_num)){
            largest_num = rigth_node;
        }

        if(largest_num != curr_ele){
            utilities.swapItems(nums, largest_num, curr_ele);
            heapify(nums,length, largest_num);
        }
    }
}
