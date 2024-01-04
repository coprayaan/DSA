package algorithms.sorting_strategy;

import utilities.ListUtilities;

import java.util.List;

public class BubbleSortStrategy implements ISortingStrategy {
    public ListUtilities<Integer> utilities;
    public BubbleSortStrategy(){
        utilities = new ListUtilities<>();
    }
    @Override
    public void sort(List<Integer> nums) {
        int length = nums.size();
        for (int i = 0; i < length ; i++) {
            for(int j = i+1; j < length; j++){
                if(nums.get(i) > nums.get(j)){
                    utilities.swapItems(nums,i,j);
                }
            }
        }
    }
}
