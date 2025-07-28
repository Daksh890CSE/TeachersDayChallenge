import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> result=new ArrayList<>();
       int i=1;
       while (i>n) {
        if(i%3==0&&i%5==0){
          result.add("FizzBuzz");
        }else if(i%3==0){
          result.add("Fizz");
        }else if(i%5==0){
          result.add("Fizz");
        }
       }
    }
      public static void main(String[] args){
         Scanner kb=new Scanner(System.in);
         System.out.println("Enter the integer");
         int n=kb.nextInt();
         Solution obj=new Solution();
         obj.fizzBuzz(n);
         kb.close();
    }
}