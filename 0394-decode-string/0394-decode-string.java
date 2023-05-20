class Solution {
    public String decodeString(String S) {
        Stack<Character> stk = new Stack<>();
		char arr[] = S.toCharArray();
		for(char c :arr)
		{
			if(c  != ']')
				stk.push(c);
			else {
				StringBuilder temp = new StringBuilder();
				while(stk.size()>0 && Character.isLetter(stk.peek()))
					temp.insert(0, stk.pop());
				String util = temp.toString();
				stk.pop();
				
				temp = new StringBuilder();
				while(stk.size()>0 && Character.isDigit(stk.peek()))
					temp.insert(0, stk.pop());
				
				int count = Integer.valueOf(temp.toString());
				while(count>0)
				{
					for(char x: util.toCharArray())
						stk.push(x);
					count--;
				}
				
			}
		}
		StringBuilder output = new StringBuilder();
		while(stk.size()>0)
			output.insert(0, stk.pop());
//		
		return output.toString();
    }
}