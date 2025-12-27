package problem;

public class BinarySearch {

       public static void main(String[] args) {
            int[] a = {1,3,4,5,6};

            int left = 0;
            int right = a.length;
            int target = 6;
            int mid = 0;
            boolean found = false;
            while( left <= right && mid<a.length-1){
                mid = (right + left )/ 2;
                if(a[mid] ==  target){
                    found = true;
                    break;
                }

                if( a[mid] > target){
                    right = mid -1;
                }
                if( a [ mid] < target){
                    left = mid +1;
                }
            }
           System.out.println(found);
        }
}
