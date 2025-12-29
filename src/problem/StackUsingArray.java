package problem;

public class StackUsingArray {

   public static int size;
   public static int top = -1;
   public static   int arr [];


    public static int pop(){

      return  arr[top--];

    }

    public static int  peek(){

   return arr[top]     ;

    }
    public static void push(int a){

        if(top == size){
            System.out.println("Overflow");
            return;
        }
        arr[++top] = a;

    }



    public static void main(String[] args) {
size=10;
        arr = new int[size];

       push(1);
        push(2);
        System.out.println("*****" + peek());
        System.out.println("#############" + pop());
        System.out.println("*****" + peek());
        System.out.println("#############" + pop());

    }
}
