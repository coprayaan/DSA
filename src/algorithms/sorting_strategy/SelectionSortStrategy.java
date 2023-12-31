package algorithms.sorting_strategy;
import utilities.ListUtilities;
import java.util.List;

public class SelectionSortStrategy implements ISortingAlgorithm{
    public ListUtilities<Integer> utilities;
    public SelectionSortStrategy(){
        utilities = new ListUtilities<>();
    }

    @Override
    public void sort(List<Integer> nums) {
        int length = nums.size();
        for (int i= 0; i < length; i++){
            int smallest = nums.get(i);
            for(int j = i+1; j<length; j++){
                if(nums.get(j) < smallest){
                    smallest = nums.get(j);
                    utilities.swapItems(nums, i , j);
                }
            }
        }
    }
}
