import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int m=kb.nextInt();
        int n=kb.nextInt();
        kb.close();
        int area=m*n;
        int max_domino;
        if(area%2==0){
            max_domino=area/2;
        }else{
            max_domino=(area-1)/2;
        }
        System.out.println(max_domino);
    }
}
