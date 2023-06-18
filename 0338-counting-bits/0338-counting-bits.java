class Solution {
    public int countOne(int number){
        String currentBinary = Integer.toBinaryString(number);
        int count = 0;
        for(int i =0;i<currentBinary.length();i++){
            if(currentBinary.charAt(i) == '1') count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int output[] = new int[n+1];
        for(int i=0;i<=n;i++){
            output[i] = countOne(i);
        }
        return output;
    }
}