class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '*'){
                stk.pop();
            } else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder answer = new StringBuilder();
        while (!stk.isEmpty()) {
            answer.append(stk.pop());
        }

        return answer.reverse().toString();
    }
}