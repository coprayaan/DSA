import algorithms.SortingAlgorithm;
import utilities.PrintingService;
import utilities.RandomGenrator;
import utilities.StopWatchService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args){
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        PrintingService<Integer> printingService = new PrintingService<>();
        RandomGenrator randomGenrator = new RandomGenrator();
        List<Integer> numbers = randomGenrator.GenerateIntList(50000,10000);
        List<Integer> unsortedNumbers = new ArrayList<>(numbers);
        StopWatchService bubbleSortTimeEstimate = new StopWatchService();
        StopWatchService selectionSortTimeEstimate = new StopWatchService();
        StopWatchService insertionSortTimeEstimate = new StopWatchService();

        System.out.println("\n____________Bubble Sorting _____________\n");
        printingService.printArray("Before Sorting :", numbers);
        bubbleSortTimeEstimate.startTimer();
        sortingAlgorithm.bubbleSort(numbers);
        bubbleSortTimeEstimate.endTimer();
        printingService.printArray("After Sorting :", numbers);

        System.out.println("\n____________Selection Sorting _____________\n");
        numbers = new ArrayList<>(unsortedNumbers);
        printingService.printArray("Before Sorting :", numbers);
        selectionSortTimeEstimate.startTimer();
        sortingAlgorithm.selectionSort(numbers);
        selectionSortTimeEstimate.endTimer();
        printingService.printArray("After Sorting :", numbers);

        System.out.println("\n____________Insertion Sorting _____________\n");
        numbers = new ArrayList<>(unsortedNumbers);
        printingService.printArray("Before Sorting :", numbers);
        insertionSortTimeEstimate.startTimer();
        sortingAlgorithm.insertionSort(numbers);
        insertionSortTimeEstimate.endTimer();
        printingService.printArray("After Sorting :", numbers);

        bubbleSortTimeEstimate.printTimeTaken("Bubble Sort");

        selectionSortTimeEstimate.printTimeTaken("Selection Sort");

        insertionSortTimeEstimate.printTimeTaken("Insertion Sort");

    }

}