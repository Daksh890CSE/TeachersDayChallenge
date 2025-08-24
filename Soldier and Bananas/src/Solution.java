import java.util.*;

public class Solution {
    public static int borrow(int price,int money,int banana){
        while(banana!=1){
            price+=price*2;
            banana--;
        }
        System.out.println(price);
    }
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        int price=kb.nextInt();
        int money=kb.nextInt();
        int banana=kb.nextInt();
        kb.close();
        System.out.println(borrow(price,money,banana));
    }
}
