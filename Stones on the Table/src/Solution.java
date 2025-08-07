import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        String s = kb.nextLine();
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                if(count<s.length()-1){
                    count+=1;
                }
            }
        }System.out.println(count);
    }
}
