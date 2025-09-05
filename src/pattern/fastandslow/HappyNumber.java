package pattern.fastandslow;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println("************" +  HappyNumber.isHappyNumber(19));
    }
    private static boolean isHappyNumber(int number) {
        int slow = number;
        int fast = getNext(number);
        while(fast !=1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast ==1;
    }

    private static int getNext(int number){
        int total = 0;
        while(number>0){
            int digit = number % 10;
             total += digit * digit;
             number = number/10;
        }
        return total;
    }

}
