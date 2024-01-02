package utilities;

import java.util.Arrays;
import java.util.List;

public class ListUtilities<T>{
    public void swapItems(List<T> list, int firstPointer, int secondPointer){
        T temp = list.get(firstPointer);
        list.set(firstPointer, list.get(secondPointer));
        list.set(secondPointer, temp);
    }

    public void copyArrayToList(T[] array, List<T> list){
        for (int i = 0; i < array.length; i++) {
            list.set(i, array[i]);
        }
    }
}
