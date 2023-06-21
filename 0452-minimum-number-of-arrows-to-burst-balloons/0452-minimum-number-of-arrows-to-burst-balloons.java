class Solution {
    public int findMinArrowShots(int[][] points) {

        if (points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1])); // sort by end element of every balloon.


        int arrowsFired = 1;//1 arrow will always be fired
        int arrowFiredValue = points[0][1]; //fire arrow at point's end to cover max distance.
        for (int i = 1; i < points.length; i++) {
            
            int left = points[i][0];
            int right = points[i][1];
            
            //check whether the arrowFired can burst other balloons.
            //if not fire arrow at the next point end value
            if (!(arrowFiredValue >= left && arrowFiredValue <= right)) {
                
                arrowsFired++; // increase the arrowsFired by 1.
                arrowFiredValue = points[i][1];  // next point end value.
                
            }
        }

        return arrowsFired;
    }
}