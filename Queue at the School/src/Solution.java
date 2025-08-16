import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int t=kb.nextInt();
        kb.nextLine();
        char[] ch=kb.nextLine().toCharArray();
        kb.close();
        for(int i=1;i<n;i++){
            if(ch[i-1]=='B' && ch[i]=='G'){
                ch[i-1]='G';
                ch[i]='B';
            }
        }
        String s=new String(ch);
        System.out.println(s);
    }
}
