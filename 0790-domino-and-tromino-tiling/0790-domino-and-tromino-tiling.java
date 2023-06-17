class Solution {
    public int numTilings(int n) {
        if(n<=2)return n;
        int [] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 5;
        int mod = 10*10*10*10*10*10*10*10*10 + 7;
        for(int x = 4; x<=n;x++){
            arr[x] = arr[x-3]+2*arr[x-1]%(mod);
            arr[x] = arr[x]%(mod);
        }

        return arr[n];
    }
}