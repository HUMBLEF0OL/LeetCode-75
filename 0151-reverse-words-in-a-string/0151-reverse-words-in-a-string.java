class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder str = new StringBuilder(s.charAt(0));
        str.insert(0,s.charAt(0));
        for(int i =1;i<s.length();i++){
            char prev = s.charAt(i-1);
			char current = s.charAt(i);
			if(prev == ' ' && current == ' ')
				continue;
			else
				str.append(current);
        }
        String arr[] = str.toString().split(" ");
        StringBuilder output = new StringBuilder(arr[arr.length-1]);
        for(int i  = arr.length-2;i>=0;i--){
            output.append(" ");
            output.append(arr[i]);
        }
        return output.toString();
        
        
        
		// String util = ""+s.charAt(0);
		// for(int i =1;i<s.length();i++)
		// {
		// 	char prev = s.charAt(i-1);
		// 	char current = s.charAt(i);
		// 	if(prev == ' ' && current == ' ')
		// 		continue;
		// 	else
		// 		util+=current;
		// }
		// String arr[] = util.split(" ");
		// s = ""+arr[arr.length-1];
		// for(int i = arr.length-2;i>=0;i--)
		// {
		// s+=" "+arr[i];
		// }
		// return s;
    }
}