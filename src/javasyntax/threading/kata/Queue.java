package javasyntax.threading.kata;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Queue {

    int[] nums = new int[100];
    List evens = new ArrayList();

    List get() {

        for(int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        return evens;
    }
}
