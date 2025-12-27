package array;

import java.util.Arrays;
import java.util.HashMap;

public class KadanesMaxSubArraySum {
    public static void main(String[] args){
        int[] a = {2, 3, 4, 6, 7};

//        Arrays.stream(index).forEach(System.out::println);
    }

    private static int kadane(int[] a) {

        int maxSoFar = a[0];
        int currentMax = a[0];

        for (int i = 1; i < a.length; i++) {
            currentMax = Math.max(a[i], currentMax + a[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

}
