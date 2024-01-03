package algorithms.searching_strategy.linear;
import algorithms.sorting_strategy.ISortingAlgorithm;
import algorithms.sorting_strategy.QuickSortStrategy;
import utilities.ListUtilities;

import java.util.List;

public class BinarySearchStrategy implements ISearchAlgorithm {

    private final List<Integer> elements;
    private final ISortingAlgorithm sortingStrategy;
    private boolean isElementsSorted;

    public ListUtilities<Integer> utilities;

    public BinarySearchStrategy(List<Integer> elements,boolean isSorted){
        this(elements);
        this.isElementsSorted = isSorted;
    }

    public BinarySearchStrategy(List<Integer> elements){
        this.elements = elements;
        this.sortingStrategy = new QuickSortStrategy();
        this.isElementsSorted = false;
        this.utilities = new ListUtilities<>();
    }


    @Override
    public boolean checkIsExist(Integer element_to_search) {
        if(!isElementsSorted){
            isElementsSorted = utilities.isSorted(elements);
            sortingStrategy.sort(elements);
        }
        return binarySearchImpl(elements,0,elements.size(), element_to_search);
    }

    private boolean binarySearchImpl(List<Integer> elements, int i, int size, Integer element_to_search) {
        int low = i;
        int high = size - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(elements.get(mid) == element_to_search){
                return true;
            } else if (elements.get(mid) < element_to_search) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return  false;
    }

}
