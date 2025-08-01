import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return false;
        }
        if (!stk.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    stk.push(s.charAt(i));
                } else if (stk.peek() == '(' && s.charAt(i) == ')') {
                    stk.pop();
                } else if (stk.peek() == '[' && s.charAt(i) == ']') {
                    stk.pop();
                } else if (stk.peek() == '{' && s.charAt(i) == '}') {
                    stk.pop();
                }
            }
        }
        return stk.empty();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.isValid(str));
        kb.close();
    }
}