package algorithms.sorting_strategy;

import utilities.ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class CountingSortStrategy implements ISortingAlgorithm{

    private final ListUtilities<Integer> utilites;

    public CountingSortStrategy(){this.utilites = new ListUtilities<Integer>();
    }
    @Override
    public void sort(List<Integer> nums) {
        // Taking the lenght of the input.
        Integer[] inputArray = nums.toArray(new Integer[0]);
        int N = inputArray.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }

        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        for (int i = 0; i < outputArray.length; i++) {
            nums.set(i, outputArray[i]);
        }
    }
}
