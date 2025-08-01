import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return is_true=false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == '(' || s.charAt(0) == '[' || s.charAt(0) == '{') {
                stk.push(s.charAt(i));
            }else if(stk.peek()=='(' &&s.charAt(i)==')'){
                stk.pop();
            }else if(stk.peek()=='[' &&s.charAt(i)==']'){
                stk.pop();
            }else if(stk.peek()=='{' &&s.charAt(i)=='}'){
                stk.pop();
            }
        }if(stk.empty()==true){
            return is_true=true;
        }
        return is_true;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.isValid(str));
        kb.close();
    }
}