package problem;

public class ArmstrongNumber {

  public   static void main(String [] args) {

      int a = 153;
      int result = 0;

      while (a> 0){

         int firstNum = a % 10;
       result = result +   firstNum*firstNum*firstNum;
       a = a/10;

      }
      System.out.println(result);
    }
}
