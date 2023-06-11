class Solution {
    String letters[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> findCombinations(String digits){
        List<String> finalResult = new ArrayList<>();
        if(digits.length() == 0) return finalResult;
        if(digits.length() == 1){
            String currentValue = letters[Character.getNumericValue(digits.charAt(0))];
            for(int i =0;i<currentValue.length();i++){
                finalResult.add(String.valueOf(currentValue.charAt(i)));
            }
            return finalResult;
        }
        System.out.println("current index ->"+digits.charAt(0));
        String currentValue = letters[Character.getNumericValue(digits.charAt(0))];
        List<String> result = findCombinations(digits.substring(1));
        
        for(int i=0;i<currentValue.length();i++){
            for(String str : result){
                String pushed = currentValue.charAt(i)+str;
                finalResult.add(pushed);
            }
        }
        return finalResult;
        
        
    }
    public List<String> letterCombinations(String digits) {
        
        return findCombinations(digits);
        
    }
}