class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        for(int i =0;i<senate.length();i++){
            if(senate.charAt(i) == 'R') rad.add(i);
            else dir.add(i);
        }
        int n = senate.length();
        while(rad.size() > 0 && dir.size() > 0){
            if(rad.peek() < dir.peek())rad.add(n++);
            else dir.add(n++);
            rad.remove();
            dir.remove();
        }
        return rad.size() == 0 ? "Dire" : "Radiant";
    }
}
/*
    for explanation
    https://leetcode.com/problems/dota2-senate/discuss/3483399/Simple-Diagram-Explanation
*/