import algorithms.AlgorithmBenchmarker;
import algorithms.searching_strategy.linear.BinarySearchStrategy;
import algorithms.searching_strategy.linear.IIndexSearchStrategy;
import algorithms.searching_strategy.linear.ISearchStrategy;
import algorithms.searching_strategy.linear.LinearSearchStrategy;
import algorithms.sorting_strategy.*;
import utilities.RandomGenrator;
import java.util.List;

public class Main {
    public static void main(String... args) {
        RandomGenrator randomGenrator = new RandomGenrator();
        List<Integer> numbers = randomGenrator.generateIntList(100,20);
//        AlgorithmBenchmarker quickSort = new AlgorithmBenchmarker(numbers, "Quick Sort", new QuickSortStrategy());
//        quickSort.run();
//
//        AlgorithmBenchmarker mergeSort = new AlgorithmBenchmarker(numbers, "Merge Sort", new MergeSortStrategy());
//        mergeSort.run();
//
//        AlgorithmBenchmarker bubbleSort = new AlgorithmBenchmarker(numbers, "Bubble Sort", new BubbleSortStrategy());
//        bubbleSort.run();
//
//        AlgorithmBenchmarker insertionSort = new AlgorithmBenchmarker(numbers, "Insertion Sort", new InsertionSortStrategy());
//        insertionSort.run();
//
//        AlgorithmBenchmarker selectionSort = new AlgorithmBenchmarker(numbers, "Selection Sort", new SelectionSortStrategy());
//        selectionSort.run();
//
//        AlgorithmBenchmarker heapSort = new AlgorithmBenchmarker(numbers, "Heap Sort", new SelectionSortStrategy());
//        heapSort.run();
//
//        AlgorithmBenchmarker countSorting = new AlgorithmBenchmarker(numbers, "Count Sort", new CountingSortStrategy());
//        countSorting.run();
//
//        AlgorithmBenchmarker redixSorting = new AlgorithmBenchmarker(numbers, "Radix Sort", new RadixSortStrategy());
//        redixSorting.run();
//
//        IIndexSearchStrategy searchAlgorithm = new LinearSearchStrategy(numbers);
//        System.out.println(searchAlgorithm.findIndexOf(25));

//        ISortingStrategy sortingAlgo = new RadixSortStrategy();
//        sortingAlgo.sort(numbers);
//        ISearchStrategy sortedBinarySearch = new BinarySearchStrategy(numbers,true);
//        System.out.println(sortedBinarySearch.checkIsExist(numbers.get(0)));

        ISearchStrategy binarySearchAlgorithm = new BinarySearchStrategy(numbers);
        System.out.println(binarySearchAlgorithm.checkIsExist(numbers.get(0)));
    }

}