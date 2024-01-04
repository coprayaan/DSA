package algorithms.sorting_strategy;

import utilities.ListUtilities;

import java.util.List;

public class QuickSortStrategy implements ISortingStrategy {
    public ListUtilities<Integer> utilities;
    public QuickSortStrategy(){
        utilities = new ListUtilities<>();
    }

    @Override
    public void sort(List<Integer> nums) {
        quickSort(nums, 0, nums.size() - 1);
    }


    private void quickSort(List<Integer> nums, int start, int end) {
        if(start >= end ){
            return;
        }
        int pivot = partition(nums, start, end);
        quickSort(nums, start, pivot-1);
        quickSort(nums, pivot+1,   end );
    }


    private int partition(List<Integer> nums, int left, int right) {
        int pivot = right;
        int leftPointer = left, rightPointer = right;
        while (leftPointer < rightPointer){
            while (leftPointer < right && nums.get(leftPointer) < nums.get(pivot)){
                leftPointer++;
            }
            while (rightPointer > left && nums.get(rightPointer) >= nums.get(pivot)){
                rightPointer--;
            }
            if(leftPointer < rightPointer){
                utilities.swapItems(nums, leftPointer, rightPointer);
            }
        }
        utilities.swapItems(nums, leftPointer, pivot);
        return leftPointer;
    }

}
