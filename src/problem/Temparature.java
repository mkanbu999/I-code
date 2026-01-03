package problem;

import java.util.Arrays;
import java.util.Stack;

public class Temparature {
    public static void main(String [] args) {
        int[] a = {9,2,3,3,6};
        var stack = new Stack<Integer>();
        int [] result = new int[a.length-1];
        for(int i = 0; i<a.length ; i++){

            while(!stack.isEmpty() && a[i] >= a[stack.peek()]){
                if(a[i]== a[stack.peek()]){
                    result[stack.pop()] =0;
                    continue;
                }
                int indx= stack.pop();
                result[indx] = i - indx;
            }
            if(i != a.length-1){
                stack.push(i);
            }

        }
        if(!stack.isEmpty()){

            result[stack.peek()] = a[stack.pop()] - a[a.length-1];
        }
        Arrays.stream(result).forEach(System.out::print);

    }
}
