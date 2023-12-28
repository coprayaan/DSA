package utilities;

import java.util.List;

public class PrintingService<T> {
    public void printArray(String message,List<T> items){
        if(message != null){
            System.out.print(message + " ");
        }
        for (T item: items) {
            System.out.print(item + " ");
        }
        System.out.print("\n");
    }
}
