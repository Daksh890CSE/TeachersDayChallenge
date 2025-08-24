import java.util.*;

public class Solution {
    public static int borrow(int price,int money,int banana){
        int cost=0;
        for(int i=1;i<=banana;i++){
            cost+=price*i;
        }if(cost>money){
            return cost-money;
        }else{
            return 0;
        }
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
