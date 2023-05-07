class Solution {
    public Boolean checkVowel(Character c){
        Character vowelArr[] = {'a','e','i','o','u','A','E','I','O','U'};
        for(char currentVowel : vowelArr){
            if(c == currentVowel)return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int i =0,j = s.length()-1;
        String result = new String(s);
        while(i<=j){
            Boolean isIVowel = checkVowel(s.charAt(i));
            Boolean isJVowel = checkVowel(s.charAt(j));
            if(isIVowel && isJVowel){
                result = result.substring(0,i)+s.charAt(j) +result.substring(i+1);
                result = result.substring(0,j)+s.charAt(i) +result.substring(j+1);
                i++;
                j--;
            } else if(isIVowel && !isJVowel){
                j--;
            } else if(!isIVowel && isJVowel){
                i++;
            } else {
                i++;
                j--;
            }
        }
        return result.toString();
    }
}