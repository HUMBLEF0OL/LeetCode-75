class Solution {
    public int minDistance(String word1, String word2) {
        // base cases - when both the strings are empty
        if(word1.length() == 0 && word2.length() == 0) return 0;
        
        //when the first word is empty
        if(word1.length() == 0) return word2.length();
        
        // when the second word is empty
        if(word2.length() == 0) return word1.length();
        
        // creating a dp array
        int dp[][] = new int[word1.length()+1][word2.length()+1];
        for(int i =0;i<dp.length;i++) {
            for(int j =0;j<dp[i].length;j++) {
                // if the length second string is 0 then edit distance will be equal to the length of first word
                if(i==0) {
                    dp[i][j] = j;
                    continue;
                }
                // if the length of the firs string is 0 then edit distance will be equal to the length of the second word
                if(j ==0) {
                    dp[i][j] = i;
                    continue;
                }
                
                // if the character at the starting indices of both string is same then edit distance will be equal to the edit distance at previous edit( at present there is not addition of edit distance)
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else {
                    // when the first characters doesn't matches
                    // then 3 cases will be formed
                        // inserting a new character in the word1
                    int t1 = dp[i][j-1];
                        // deleting a word from word1
                    int t2 = dp[i-1][j];
                        // replacing the first character of word1 with that of word2
                    int t3 = dp[i-1][j-1];
                    
                    // find the minimum amongst them
                    int min = 1+Math.min(t3,Math.min(t2,t1));
                    dp[i][j] = min;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}