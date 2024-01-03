package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenrator {

    public List<Integer> generateIntList(int range, int count){
        return generateIntList(0, range, count);
    }

    public List<Integer> generateIntList(int start, int end, int count){
        // Create a new ArrayList to store the random integers
        ArrayList<Integer> randomIntegers = new ArrayList<>();

        // Create a new Random object
        Random random = new Random();

        // Generate n random integers
        for (int i = 0; i < count; i++) {
            randomIntegers.add(random.nextInt(end - start + 1) + start );
        }

        return randomIntegers;
    }

    public Integer generateRandomInteger(int range){
        return new Random().nextInt(range);
    }

}
