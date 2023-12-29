package algorithms;

import java.util.Arrays;
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

    public List<Integer> mergeSort(List<Integer> nums){
        Integer[] numsArray = nums.toArray(new Integer[0]);
        mergeSortSplit(numsArray, 0, numsArray.length - 1);
        return   Arrays.asList(numsArray);
    }

    private void mergeSortSplit(Integer[] numsArray, int low, int high) {
        if(low < high){
            int mid =( low + high )/2;
            mergeSortSplit(numsArray, low, mid);
            mergeSortSplit(numsArray, mid + 1, high);
            merge(numsArray, low, mid, high);
        }
    }

    private void merge(Integer[] numsArray, int low, int mid,int high) {
        // caluclating the length of the two arrays.
        int leftSArrayLength = (mid - low) + 1;
        int rightArrayLength = high - mid;

        //Creating temporary Arrays.
        Integer[] leftArray = new Integer[leftSArrayLength];
        Integer[] rightArray = new Integer[rightArrayLength];

        // Copying values from temporary array.
        int leftArrayIndex = 0;
        for(int i = low; i<= mid; i++){
            leftArray[leftArrayIndex++] = numsArray[i];
        }
        int rightArrayIndex = 0;
        for(int i = mid+1; i<= high; i++){
            rightArray[rightArrayIndex++] = numsArray[i];
        }

        rightArrayIndex = 0;
        leftArrayIndex = 0;
        int mainArrayIndex = low;
        try{
            while(leftArrayIndex < leftSArrayLength && rightArrayIndex < rightArrayLength){
                if(leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]){
                    numsArray[mainArrayIndex++] = leftArray[leftArrayIndex++];
                }
                else{
                    numsArray[mainArrayIndex++] = rightArray[rightArrayIndex++];
                }
            }

            if(leftArrayIndex < leftSArrayLength){
                numsArray[mainArrayIndex++] = leftArray[leftArrayIndex++];
            }
            if(rightArrayIndex < rightArrayLength){
                numsArray[mainArrayIndex++] = rightArray[rightArrayIndex++];
            }

        }
        catch (NullPointerException exception){
            System.out.println(exception);
        }

    }

    private void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }
}


