The problem can be solved using dynamic programming approach:
* maintain an array that contains the minimum number cost
* use recursion and lay down the base condition
* the dp array will hold the minimum cost
* if we have the value of current steps then return it otherwise
* calculate the minimum based on n-1 and n-2 recursive step
* store the minimum value in dp array and then return