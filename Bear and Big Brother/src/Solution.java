import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        int year=0;
        while(a<b){
            a+=a*3;
            b+=b*2;
            year++;
        }
    }
}
