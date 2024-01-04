package algorithms;

import algorithms.sorting_strategy.ISortingStrategy;
import utilities.PrintingService;
import utilities.StopWatchService;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmBenchmarker {
    private ISortingStrategy strategy;
    private final PrintingService<Integer> printingService;
    private String label;
    private List<Integer> numbers ;
    private final StopWatchService timeEstimate;

    public AlgorithmBenchmarker(List<Integer> numbers, String label , ISortingStrategy strategy ){
        this.strategy = strategy;
        this.printingService = new PrintingService<>();
        this.numbers = new ArrayList<>(numbers);
        this.timeEstimate = new StopWatchService();
        this.label= label;
    }

    public void run(){
        System.out.println("\n____________"+ this.label +"_____________\n");
        printingService.printArray("Before Sorting :", numbers);
        timeEstimate.startTimer();
        strategy.sort(numbers);
        timeEstimate.endTimer();
        printingService.printArray("After Sorting :", numbers);
        displayTimeToExecute();
    }

    public void displayTimeToExecute(){
        timeEstimate.printTimeTaken(this.label);
    }
}


