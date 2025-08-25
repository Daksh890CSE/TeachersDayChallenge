import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        double frac=0;
        for(int i=0;i<n;i++){
            frac+=kb.nextInt()/100;
        }
        System.out.println(frac/n*100);
    }
}
