import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        String regex="[^A-Za-z]";
        s=s.replaceAll(regex,"");
        s=s.toLowerCase();
        String revstr=new StringBuffer(s).reverse().toString();
        if(s.equalsIgnoreCase(revstr)){
            return true;
        }else{
            return false;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter String to verify palindrome: ");
        String s=kb.nextLine();
        Solution obj = new Solution();
        boolean check=obj.isPalindrome(s);
        System.out.println(check);
    }
}
