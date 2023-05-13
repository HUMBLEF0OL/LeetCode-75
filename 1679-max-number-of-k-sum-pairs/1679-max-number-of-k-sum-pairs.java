class Solution {
    public int maxOperations(int[] arr, int k) {
        int pair = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< arr.length;i++){
            int required = k- arr[i];
            if(map.containsKey(required) && map.get(required)>0){
                pair++;
                map.put(required,map.get(required)-1);
            }
            else{
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        return pair;
    }
}