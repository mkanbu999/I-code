package pattern.mergeinterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

    public static void main(String[] args) {
        int[][] array = {
            {1, 4},// 3 is overlapping put the max val
            {3, 4},
            {6, 7}
        };
        Arrays.sort(array, Comparator.comparingInt(i->i[0]));
        var result = MergeInterval.merge(array);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] merge(int[][] intervals) {

        List<int[]>  mergedArray = new ArrayList<>();
         var newInterval = intervals[0];
        mergedArray.add(newInterval);
        for(int[] interval : intervals){

            if(interval[0]<=newInterval[1]){
                newInterval[1]=Math.max(interval[1],newInterval[1]);
            }
            else{
                newInterval = interval;
                mergedArray.add(newInterval);
            }

        }
        return mergedArray.toArray(new int[mergedArray.size()][]);
    }
}
