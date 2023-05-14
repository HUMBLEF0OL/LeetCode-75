class Solution {
    private boolean checkVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int result = 0;
        int currentCount = 0;
        StringBuilder currentString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            currentString.append(s.charAt(i));
            // System.out.println(currentString);
            if (i < k) {
                if (checkVowel(currentChar)) {
                    result++;
                    currentCount++;
                }
            } else {
                char startingChar = currentString.charAt(0);
                if (checkVowel(startingChar)) {
                    currentCount--;
                }
                currentString.deleteCharAt(0);
                if (checkVowel(currentChar)) {
                    currentCount++;
                }
                result = Math.max(currentCount, result);

            }
        }
        return result;
    }
}