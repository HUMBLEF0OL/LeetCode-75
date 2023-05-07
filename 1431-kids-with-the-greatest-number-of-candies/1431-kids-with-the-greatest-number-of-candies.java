class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extra) {
        // creating an output list
        List<Boolean> list = new ArrayList<>();
        
        // finding the max element in the array
        int max = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]+extra>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}