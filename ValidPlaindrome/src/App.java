import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        String regex="[^A-Za-z]";
        s=s.replaceAll(regex,"");
        s=s.toLowerCase();
        for(int i=0;s.length())
        return true;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter String to verify palindrome: ");
        String s=kb.nextLine();
        Solution obj = new Solution();
        boolean check=obj.isPalindrome(s);
    }
}
