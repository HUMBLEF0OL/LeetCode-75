class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        for(int i =0 ;i < s.length();i++){
            if(s.charAt(i) != '*') str.append(s.charAt(i));
            else{
                if(str.length() > 0) str.deleteCharAt(str.length()-1);
            }
        }
        return str.toString();
    }
}