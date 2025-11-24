package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] a = {2, 3, 4, 6, 7};
        int[] index=  findIndex(a);

//        Arrays.stream(index).forEach(System.out::println);
    }

    private static int[] findIndex(int[] a) {
        int target = 9;
        int [] b= new int[2];
        var map =new HashMap<Integer, Integer>();
        for(int i = 0; i< a.length; i++){

            if(map.containsKey(target - a[i])) {
                b[0] = map.get(target - a[i]);
                b[1] = i;
                Arrays.stream(b).forEach(System.out::print);
                System.out.println();
            }
            map.put(a[i], i);

        }
        return b;
    }
}
