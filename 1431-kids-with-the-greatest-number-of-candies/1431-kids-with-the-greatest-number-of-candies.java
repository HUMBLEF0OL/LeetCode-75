class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxValueIndex = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > candies[maxValueIndex]){
                maxValueIndex = i;
            }
        }
        for(int i =0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=candies[maxValueIndex])result.add(true);
            else result.add(false);
        }
        return result;
    }
}