package algorithms;

import java.util.List;

public class SortingAlgorithm {
    public void bubbleSort(List<Integer> nums){
        int length = nums.size();
        for (int i = 0; i < length ; i++) {
            for(int j = i+1; j < length; j++){
                if(nums.get(i) > nums.get(j)){
                    swap(nums,i,j);
                }
            }
        }
    }

    public void selectionSort(List<Integer> nums){
        int length = nums.size();
        for (int i= 0; i < length; i++){
            int smallest = nums.get(i);
            for(int j = i+1; j<length; j++){
                if(nums.get(j) < smallest){
                    smallest = nums.get(j);
                    swap(nums, i , j);

                }
            }
        }
    }

    public void insertionSort(List<Integer> nums){
        int length = nums.size();
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(nums.get(j) < nums.get(i)){
                    swap(nums, i, j);
                }
            }
        }
    }

    private void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }
}


