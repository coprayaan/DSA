package algorithms.sorting_strategy;

import utilities.ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStrategy implements ISortingStrategy {
    public ListUtilities<Integer> utilities;
    public MergeSortStrategy(){
        utilities = new ListUtilities<>();
    }
    @Override
    public void sort(List<Integer> nums) {
        split(nums, 0, nums.size() - 1);
    }

    private void split(List<Integer> numsList, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            split(numsList, low, mid);
            split(numsList, mid + 1, high);
            merge(numsList, low, mid, high);
        }
    }

    private void merge(List<Integer> numsList, int low, int mid, int high) {
        // calculating the length of the two lists.
        int leftListLength = (mid - low) + 1;
        int rightListLength = high - mid;

        // Creating temporary Lists.
        List<Integer> leftList = new ArrayList<>(numsList.subList(low, mid + 1));
        List<Integer> rightList = new ArrayList<>(numsList.subList(mid + 1, high + 1));

        int leftListIndex = 0;
        int rightListIndex = 0;
        int mainListIndex = low;

        while (leftListIndex < leftListLength && rightListIndex < rightListLength) {
            if (leftList.get(leftListIndex) <= rightList.get(rightListIndex)) {
                numsList.set(mainListIndex++, leftList.get(leftListIndex++));
            } else {
                numsList.set(mainListIndex++, rightList.get(rightListIndex++));
            }
        }

        while (leftListIndex < leftListLength) {
            numsList.set(mainListIndex++, leftList.get(leftListIndex++));
        }
        
        while (rightListIndex < rightListLength) {
            numsList.set(mainListIndex++, rightList.get(rightListIndex++));
        }
    }

}
