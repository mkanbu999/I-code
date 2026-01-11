package array;

public class MaxSubArray {
    public static void main(String[] args) {


        int a [] = {1,3,3,4,5};
        int sum = 0 ;
        int right = 0;
        int left = 0;
        int asn = 0;
        for(int i = 0; i<a.length ; i++){
            sum = sum + a[right] ;
            while(sum >= 7){
                if(sum == 7){
                    asn = Math.max(asn, right - left +1);
                    break;
                }else {
                    sum = sum - a[left];
                    left++;
                }
            }
            right ++;
        }
        System.out.println(asn);

    }

}
