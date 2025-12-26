package problem;

import java.util.Arrays;
import java.util.Stack;

public class Temparature {
    public static void main(String [] args) {
        int[] a = {1,2,3,3,5};
        var stack = new Stack<Integer>();
        int [] result = new int[a.length-1];
        for(int i = 0; i<a.length ; i++){

            while(!stack.isEmpty() && a[i] >= stack.peek()){
                if(a[i]== a[stack.peek()]){
                    result[stack.pop()] =0;
                    continue;
                }
                int indx= stack.pop();
                result[indx] = i - indx;
            }
            stack.push(i);
        }
        Arrays.stream(result).forEach(System.out::print);

    }
}
