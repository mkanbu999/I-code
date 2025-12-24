package problem;

public class LongestSubStringWithKReplacemen {

   public  static void main(String[] args) {
        var a= "ABAABABB";
        int k = 1;
        int maxFrequency = 0;
        int left =0;
        int result = 0;
       int [] arr= new int[26];
        for(int i = 0; i< a.length(); i++){
            arr[a.charAt(i) - 'A']++;
            maxFrequency = Math.max(maxFrequency, arr[a.charAt(i) - 'A']);

            while(i - left + 1 - maxFrequency > k){
                arr[a.charAt(left)  - 'A']--;
                left++;
            }
            result = Math.max(result,  i - left + 1);
        }
       System.out.println(result);

    }

}
