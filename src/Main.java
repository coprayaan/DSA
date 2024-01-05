import algorithms.searching_strategy.linear.IIndexSearchStrategy;
import algorithms.searching_strategy.linear.LinearSearchStrategy;
import utilities.RandomGenrator;

import java.util.List;

public class Main {
    public static void main(String... args) {
        RandomGenrator randomGenrator = new RandomGenrator();
        List<Integer> numbers = randomGenrator.generateIntList(10000,2000);
//
//        SortAlgorithmBenchmarker quickSort = new SortAlgorithmBenchmarker(numbers, "Quick Sort", new QuickSortStrategy());
//        quickSort.run();
//
//        SortAlgorithmBenchmarker mergeSort = new SortAlgorithmBenchmarker(numbers, "Merge Sort", new MergeSortStrategy());
//        mergeSort.run();
//
//        SortAlgorithmBenchmarker bubbleSort = new SortAlgorithmBenchmarker(numbers, "Bubble Sort", new BubbleSortStrategy());
//        bubbleSort.run();
//
//        SortAlgorithmBenchmarker insertionSort = new SortAlgorithmBenchmarker(numbers, "Insertion Sort", new InsertionSortStrategy());
//        insertionSort.run();
//
//        SortAlgorithmBenchmarker selectionSort = new SortAlgorithmBenchmarker(numbers, "Selection Sort", new SelectionSortStrategy());
//        selectionSort.run();
//
//        SortAlgorithmBenchmarker heapSort = new SortAlgorithmBenchmarker(numbers, "Heap Sort", new SelectionSortStrategy());
//        heapSort.run();
//
//        SortAlgorithmBenchmarker countSorting = new SortAlgorithmBenchmarker(numbers, "Count Sort", new CountingSortStrategy());
//        countSorting.run();
//
//        SortAlgorithmBenchmarker redixSorting = new SortAlgorithmBenchmarker(numbers, "Radix Sort", new RadixSortStrategy());
//        redixSorting.run();

        IIndexSearchStrategy searchAlgorithm = new LinearSearchStrategy(numbers);
        System.out.println(searchAlgorithm.getIndex(25));

//        ISortingStrategy sortingAlgo = new RadixSortStrategy();
//        sortingAlgo.sort(numbers);
//        ISearchStrategy sortedBinarySearch = new BinarySearchStrategy(numbers,true);
//        System.out.println(sortedBinarySearch.checkIsExist(numbers.get(0)));

//        ISearchStrategy binarySearchAlgorithm = new BinarySearchStrategy(numbers);
//        System.out.println(binarySearchAlgorithm.checkIsExist(numbers.get(0)));
    }

}