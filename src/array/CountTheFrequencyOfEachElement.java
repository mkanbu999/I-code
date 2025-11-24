package array;

import java.util.HashMap;

public class CountTheFrequencyOfEachElement {
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 6, 5, }; //3, 4, 5, 1,2 right; left 4,5,1,2,3
        int k = 3;

        var result=   rotate( a);
//        System.out.println(result);
    }

    public static boolean rotate(int[] a) {

        var map = new HashMap<Integer, Integer>();

        for(int i = 0; i< a.length;i++){
            if(map.containsKey(a[i]))    {
              var keyValue=  map.get(a[i]);
              keyValue = keyValue + 1;
              map.put(a[i], keyValue);
              continue;
            }
            map.put(a[i], 1);

        }
        map.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

        return true;
    }
}
