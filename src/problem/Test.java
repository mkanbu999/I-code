package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[][] array = {
                {2, 4},// 3 is overlapping put the max val
                {3, 5},
                {6, 7}
        };

        Arrays.sort(array, Comparator.comparingInt(i -> i[0]));
       var result = mergeInterval(array);
        System.out.println(Arrays.deepToString(result));
    }


    private static int[][] mergeInterval(int[][] intervals) {

        List<int[]> arrayList = new ArrayList<>();
        int[] firstInterval = intervals[0];
        arrayList.add(firstInterval);

        for(int[]interval : intervals){
            if(firstInterval[1] >= interval[0]){
                firstInterval[1]= Integer.max(firstInterval[1], interval[1]);
            }
            else{
                firstInterval = interval;
                arrayList.add(firstInterval);
            }

        }
        return arrayList.toArray(new int[arrayList.size()][]);
    }

}
