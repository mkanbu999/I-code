package array;

public class MissingNumber {
    public static void main (String[] args){

        int [] a = {1, 2, 3, 4,6};
        int b =  findSmallest(a);
//        System.out.println(b);
    }

    private static int findSmallest(int [] a ) {
        int n = 6;
        int total = 0;
        int arrTotal= 0;
        for(int i = 1; i <= a.length +1; i ++){
            total = total +i;
        }
        for(int i = 0; i < a.length; i ++){
            arrTotal = arrTotal + a[i];
        }
        System.out.println(total - arrTotal);
        return 0;
    }
}
