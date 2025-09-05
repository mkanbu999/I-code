package pattern.twopointer;

import java.util.Arrays;

public class TwoPointerInSortedArray {

    public static void main(String[] args) {
        int[] array = {2, 5, 7, 8};
        int target = 12;
        Arrays.sort(array);
        var result = TwoPointerInSortedArray.findIndex(array, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] findIndex(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int sum = array[start] + array[end];
            int[] index = new int[2];
            if (sum == target) {
                index[0] = array[start];
                index[1] = array[end];
                return index;
            }
            if (sum < target) {
                start++;
            } else {
                end--;
            }

        }
        return new int[0];
    }
}
