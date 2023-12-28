package utilities;

public class StopWatchService {
    private long startTime;
    private long endTime;
    public void startTimer(){
        startTime = System.currentTimeMillis();
    }
    public void endTimer(){
        endTime = System.currentTimeMillis();
    }

    public void printTimeTaken(String message) {
        System.out.println("\nTime taken for "+ message + " to sort : " + (endTime - startTime) + " ms");
    }
}
