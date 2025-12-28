package problem;

public class IsPerfectSquare {

   public static void main(String [] arg) {

       int a = 26;

       int left = 1;
       int right =a;
       int mid = 0;
       boolean isPef=false;

       while(left < right){

           mid = 1 + (right-left)/2;

           mid = mid * mid;
           if(mid == a){
              isPef = true;
              break;
           }
           if( mid< a){
               left++;
           }else{
               right--;
           }

       }
       System.out.println(isPef);

//
//       boolean run = true;
//       boolean isQuare = true;
//
//       int i = 0;
//       while(run && i<a){
//           i++;
//           if(i * i == a){
//               run = false ;
//           }
//
//       }
//       System.out.println( run);
    }
}
