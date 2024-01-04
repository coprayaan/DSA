package algorithms.sorting_strategy;

import utilities.ListUtilities;

import java.util.List;

public class InsertionSortStrategy implements ISortingStrategy {
    public ListUtilities<Integer> utilities;
    public InsertionSortStrategy(){
        utilities = new ListUtilities<>();
    }
    @Override
    public void sort(List<Integer> nums) {
        int n = nums.size();
        for (int i = 1; i < n; ++i) {
            int key = nums.get(i);
            int j = i - 1;

            // Move elements of list.get(0..i-1) that are greater than key to one position ahead of their current position
            while (j >= 0 && nums.get(j) > key) {
                nums.set(j + 1, nums.get(j));
                j = j - 1;
            }

            nums.set(j + 1, key);
        }
    }
}
