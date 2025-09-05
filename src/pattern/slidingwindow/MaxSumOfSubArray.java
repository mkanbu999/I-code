package pattern.slidingwindow;

public class MaxSumOfSubArray {

    public static void main(String[] args) {

        int[] array= {2,3,4,5};
        int k=2;
        int maxSum = MaxSumOfSubArray.findMaxSum(array, k);
        System.out.println(maxSum);
    }
    private static int findMaxSum(int[] array, int k) {
        int sumOfFirstSubArr = 0;
        int maxSum=0;
        for(int i =0; i< k ;i ++){
            sumOfFirstSubArr += array[i];
        }
        for(int i= k ; i<array.length; i++){
            sumOfFirstSubArr = sumOfFirstSubArr - array[i-k] + array[i];
            maxSum =  Math.max(maxSum, sumOfFirstSubArr);
        }
        return maxSum;
    }

}
