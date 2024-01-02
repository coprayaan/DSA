import algorithms.SortingHelper;
import algorithms.searching_strategy.ISearchAlgorithm;
import algorithms.searching_strategy.LinearSearchStrategy;
import algorithms.sorting_strategy.*;
import exceptions.CustomException;
import utilities.RandomGenrator;
import java.util.List;

public class Main {
    public static void main(String... args) throws CustomException {
        RandomGenrator randomGenrator = new RandomGenrator();
        List<Integer> numbers = randomGenrator.GenerateIntList(50000,10000);
//        SortingHelper quickSort = new SortingHelper(numbers, "Quick Sort", new QuickSortStrategy());
//        quickSort.run();
//
//        SortingHelper mergeSort = new SortingHelper(numbers, "Merge Sort", new MergeSortStrategy());
//        mergeSort.run();
//
//        SortingHelper bubbleSort = new SortingHelper(numbers, "Bubble Sort", new BubbleSortStrategy());
//        bubbleSort.run();
//
//        SortingHelper insertionSort = new SortingHelper(numbers, "Insertion Sort", new InsertionSortStrategy());
//        insertionSort.run();
//
//        SortingHelper selectionSort = new SortingHelper(numbers, "Selection Sort", new SelectionSortStrategy());
//        selectionSort.run();
//
//        SortingHelper heapSort = new SortingHelper(numbers, "Heap Sort", new SelectionSortStrategy());
//        heapSort.run();
//
//        SortingHelper countSorting = new SortingHelper(numbers, "Count Sort", new CountingSortStrategy());
//        countSorting.run();
//
//        SortingHelper redixSorting = new SortingHelper(numbers, "Radix Sort", new RadixSortStrategy());
//        redixSorting.run();

        LinearSearchStrategy<Integer> searchAlgorithm = new LinearSearchStrategy<Integer>(numbers);
        System.out.println(searchAlgorithm.findIndex(numbers.get(440)));
     

    }

}