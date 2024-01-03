import algorithms.SortingHelper;
import algorithms.searching_strategy.linear.BinarySearchStrategy;
import algorithms.searching_strategy.linear.ISearchAlgorithm;
import algorithms.sorting_strategy.ISortingAlgorithm;
import algorithms.sorting_strategy.RadixSortStrategy;
import utilities.RandomGenrator;
import java.util.List;

public class Main {
    public static void main(String... args) {
        RandomGenrator randomGenrator = new RandomGenrator();
        List<Integer> numbers = randomGenrator.generateIntList(100,20);
//        SortingHelper quickSort = new SortingHelper(numbers, "Quick Sort", new QuickSortStrategy());
//        quickSort.run();

//        SortingHelper mergeSort = new SortingHelper(numbers, "Merge Sort", new MergeSortStrategy());
//        mergeSort.run();

//        SortingHelper bubbleSort = new SortingHelper(numbers, "Bubble Sort", new BubbleSortStrategy());
//        bubbleSort.run();

//        SortingHelper insertionSort = new SortingHelper(numbers, "Insertion Sort", new InsertionSortStrategy());
//        insertionSort.run();

//        SortingHelper selectionSort = new SortingHelper(numbers, "Selection Sort", new SelectionSortStrategy());
//        selectionSort.run();

//        SortingHelper heapSort = new SortingHelper(numbers, "Heap Sort", new SelectionSortStrategy());
//        heapSort.run();

//        SortingHelper countSorting = new SortingHelper(numbers, "Count Sort", new CountingSortStrategy());
//        countSorting.run();

//        SortingHelper redixSorting = new SortingHelper(numbers, "Radix Sort", new RadixSortStrategy());
//        redixSorting.run();

//        IIndexSearchAlgorithm searchAlgorithm = new LinearSearchStrategy(numbers);
//        System.out.println(searchAlgorithm.findIndexOf(25));

//        ISortingAlgorithm sortingAlgo = new RadixSortStrategy();
//        sortingAlgo.sort(numbers);
//        ISearchAlgorithm binarySearchAlgorith = new BinarySearchStrategy(numbers,true);
//        System.out.println(binarySearchAlgorith.checkIsExist(numbers.get(0)));

        ISearchAlgorithm binarySearchAlgorith = new BinarySearchStrategy(numbers);
        System.out.println(binarySearchAlgorith.checkIsExist(numbers.get(0)));
    }

}