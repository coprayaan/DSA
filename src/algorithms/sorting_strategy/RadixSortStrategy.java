package algorithms.sorting_strategy;

import utilities.ListUtilities;

import java.util.Arrays;
import java.util.List;

public class RadixSortStrategy implements ISortingAlgorithm{

    public ListUtilities<Integer> utilities;
    public RadixSortStrategy(){
        utilities = new ListUtilities<>();
    }
    @Override
    public void sort(List<Integer> nums) {
        int maxDigNumber = 0;
        for (Integer num : nums) {
            maxDigNumber = Math.max(maxDigNumber, num);
        }

        for (int exp = 1; maxDigNumber / exp > 0; exp *= 10) {
            countSort(nums, nums.size(), exp);
        }
    }

    private void countSort(List<Integer> nums, int size, int exp) {
        Integer[] inputArray = nums.toArray(new Integer[0]);
        Integer[] output = new Integer[size];
        Integer[] count = new Integer[10];
        Arrays.fill(count,0);
        int i ;
        for ( i = 0; i < size ; i++) {
            count[(inputArray[i] / exp) % 10]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i-1];
        }

        for ( i = size-1 ; i >= 0; i--){
            output[count[(inputArray[i] / exp) % 10] - 1] = inputArray[i];
            count[(inputArray[i] / exp) % 10]--;
        }

        utilities.copyArrayToList(output, nums);
    }
}
