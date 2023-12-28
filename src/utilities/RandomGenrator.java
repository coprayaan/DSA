package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenrator {

    public List<Integer> GenerateIntList(int range, int count){
        return GenerateIntList(0, range, count);
    }

    public List<Integer> GenerateIntList(int start, int end, int count){
        // Create a new ArrayList to store the random integers
        ArrayList<Integer> randomIntegers = new ArrayList<>();

        // Create a new Random object
        Random random = new Random();

        // Generate 2000 random integers
        for (int i = 0; i < count; i++) {
            randomIntegers.add(random.nextInt(end - start + 1) + start );
        }

        return randomIntegers;
    }

}
