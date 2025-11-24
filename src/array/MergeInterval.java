package array;

import java.util.*;

public class MergeInterval {
    public static void main(String[] args){
        int[][] a = { {1, 3 }, {2, 4}, {3, 8}};
        Arrays.sort(a, Comparator.comparingInt(e-> e[0] ));
        int[][] index=  findIndex(a);
        System.out.println(Arrays.deepToString(index));

//        Arrays.stream(index).forEach(System.out::println);
    }

    private static int[][] findIndex(int[][]  a) {
        List<int[]> accArray = new ArrayList<>();
        int[] initialArray = a[0];
        accArray.add(initialArray);
        for (int[] breakArray : a) {
            if (initialArray[1] >= breakArray[0]) {
                initialArray[1] = Math.max(initialArray[1], breakArray[1]);
                continue;
            } else {
                initialArray = breakArray;
                accArray.add(initialArray);
            }


        }
        return accArray.toArray(new int[accArray.size()][]);
    }
}
