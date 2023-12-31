import algorithms.SortingHelper;
import algorithms.sorting_strategy.*;
import utilities.RandomGenrator;
import java.util.List;

public class Main {
    public static void main(String... args){
        RandomGenrator randomGenrator = new RandomGenrator();
        List<Integer> numbers = randomGenrator.GenerateIntList(50000,10000);
        SortingHelper quickSort = new SortingHelper(numbers, "Quick Sort", new QuickSortStrategy());
        quickSort.run();

        SortingHelper mergeSort = new SortingHelper(numbers, "Merge Sort", new MergeSortStrategy());
        mergeSort.run();

        SortingHelper bubbleSort = new SortingHelper(numbers, "Bubble Sort", new BubbleSortStrategy());
        bubbleSort.run();

        SortingHelper insertionSort = new SortingHelper(numbers, "Insertion Sort", new InsertionSortStrategy());
        insertionSort.run();

        SortingHelper selectionSort = new SortingHelper(numbers, "Selection Sort", new SelectionSortStrategy());
        selectionSort.run();
    }

}