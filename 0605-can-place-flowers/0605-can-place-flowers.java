class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if((flowerbed[0] == 0 && n <=1) || n < 1)return true;
            else return false;
        }
        for(int i =0;i<flowerbed.length-1;i++){
            if(i == 0){
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    --n;
                }
            }
            else if( flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                --n;
            }
        }
        if(flowerbed[flowerbed.length-2] == 0 && flowerbed[flowerbed.length-1] == 0) --n;
        return n <= 0 ? true : false;
    }
}