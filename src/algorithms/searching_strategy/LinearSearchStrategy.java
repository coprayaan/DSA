package algorithms.searching_strategy;

import exceptions.CustomException;

import java.util.List;

public class LinearSearchStrategy<T> implements ISearchAlgorithm{


    private List<T> data;

    public LinearSearchStrategy(List<T> data){
        this.data = data;
    }

    @Override
    public boolean search(Integer element)  {
        return findIndex(element) > 0;
    }

    public int findIndex(Integer element) {
        for (int i=0; i<data.size() ;i++) {
            if(data.get(i) == element){
                return i;
            }
        }
        return -1;
    }

}
