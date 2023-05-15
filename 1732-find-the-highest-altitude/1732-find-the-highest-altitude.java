class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int result = Integer.MIN_VALUE;
        for(int i =0;i<gain.length;i++){
            currentAltitude += gain[i];
            result = Math.max(result,currentAltitude);
            System.out.println(result + " "+ currentAltitude + " "+ gain[i]);
            // if(currentAltitude < gain[i]) currentAltitude = gain[i];
        }
        return result < 0 ? 0 : result;
    }
}