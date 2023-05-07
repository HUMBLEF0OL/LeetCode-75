class Solution {
    public String reverseVowels(String s) {
        // we will maintain a hashMap of vowels
        if(s.length() == 1)
            return s;
        HashMap<Character,Boolean> map = new HashMap<>();
        map.put('A',true);
        map.put('a',true);
        map.put('E',true);
        map.put('e',true);
        map.put('I',true);
        map.put('i',true);
        map.put('O',true);
        map.put('o',true);
        map.put('U',true);
        map.put('u',true);
        // we will be maintaining 2 pointers
        int i =0,j = s.length()-1;
        StringBuilder output = new StringBuilder(s);
        while(i<j)
        {
            char c1 = output.charAt(i);
            char c2 = output.charAt(j);
            if(map.containsKey(c1) && map.containsKey(c2))
            {
                char temp = c1;
                StringBuilder s1 = new StringBuilder(output.substring(0,i)+c2);
                StringBuilder s2 = new StringBuilder(output.substring(i+1,j)+c1+output.substring(j+1));
                output = new StringBuilder(s1);
                output.append(s2);
                i++;j--;
            }
            else if(map.containsKey(c1))
                j--;
            else if(map.containsKey(c2))
                i++;
            else
            {
                i++;
                j--;
            }
        }
        return output.toString();
        
        
    }
}