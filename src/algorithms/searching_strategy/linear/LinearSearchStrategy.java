package algorithms.searching_strategy.linear;

import java.util.List;

public class LinearSearchStrategy implements IIndexSearchStrategy {

    private final List<Integer> elements;

    public LinearSearchStrategy(List<Integer> elements){
        this.elements = elements;
    }
    @Override
    public int findIndexOf(Integer element_to_find_index) {
        for (int i=0; i<elements.size() ;i++) {
            if(elements.get(i) == element_to_find_index){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean checkIsExist(Integer element_to_search) {
        return findIndexOf(element_to_search) > 0;
    }
}
