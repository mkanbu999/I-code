package array;

public class FindLargestOrSmallest {

    public static void main (String[] args){

        int [] a = {1, 3,4,5,0};
      int b =  findSmallest(a);
        System.out.println(b);
    }

    private static int findSmallest(int [] a ) {
        int j = a[1];
        for(int i =0; i< a.length; i++){
            if(a[i]>= j) j= a[i];
        }
        return j;
    }
}
