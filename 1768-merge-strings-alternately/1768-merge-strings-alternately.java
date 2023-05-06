class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s1 = new StringBuilder(word1);
        StringBuilder s2 = new StringBuilder(word2);
        StringBuilder output = new StringBuilder();
        int i =0,j=0;
        for(;i<s1.length() && j<s2.length();i++,j++){
            output.append(s1.charAt(i));
            output.append(s2.charAt(j));
        }
        if(i != s1.length()) output.append(s1.substring(i));
        if(j != s2.length()) output.append(s2.substring(j));
        return output.toString();
        
    }
}