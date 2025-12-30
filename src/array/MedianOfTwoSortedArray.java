package array;

import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArray {

   public static void main(String[] args) {

       int a[] = {1,2,4};
       int b[] = {3,5,6,7,8};

       int left = 0;
       int right = 0;
       int [] sortedArray = new int[a.length + b.length];

       for(int i =0; i<sortedArray.length; i++){
           if(left<a.length-1 && a[left] < b[right] ){
               sortedArray[i] = a[left];
               left++;
           }
           else if (right<=b.length-1 &&  a[left] > b[right]){
               sortedArray[i] = b[right];
               right++;
           }
           if(left == a.length-1 && right < b.length) {
               sortedArray[i] = b[right++];
           }
           if(right == b.length-1 && left < a.length) {
               sortedArray[i] = a[left++];
           }
       }

       Arrays.stream(sortedArray).forEach(System.out::print);

//
//     var list1=  Arrays.asList(Arrays.asList(a), Arrays.asList(b));
//
//       var ans = Arrays.stream(new int[][]{a, b})
//               .flatMapToInt(Arrays::stream) // flatten int arrays
//               .sorted()
//               .boxed()
//               .toList();
//
//       System.out.println((ans.size()-1) /2);
//
//       if(((ans.size()-1) /2) %2 != 0){
//        var median=   (ans.size()-1) /2;
//
//           System.out.println(ans.get(median));
//
//       }
//       else{
//           var median=   (ans.size()-1) /2;
//
//          var sum = ans.get(median) + ans.get(median+1) ;
//
//           System.out.println((float) sum/2);
//
//       }


//    ans.forEach(System.out::println);

//       int resulArray[]= new int[(a.length-1 )+ (b.length-1)];
//
//       for( )

    }
}
