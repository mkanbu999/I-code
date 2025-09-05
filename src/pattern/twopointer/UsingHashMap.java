package pattern.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {

    public static void main(String[] args) {
        int[] array = {2, 5, 7, 8};
        int target = 12;
        Arrays.sort(array);
        var result = UsingHashMap.findIndex(array, target);
        System.out.println(Arrays.toString(result));
    }
    private static int[] findIndex(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            if(map.containsKey(target - array[i])){
                return new int[]{target - array[i], array[i]};
            }
            else {
                map.put(array[i], i);
            }

        }
        return new int[0];
    }


}
