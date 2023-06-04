* Initialize an empty queue queue to store all the nodes to be visited.
* Add entrance and its distance 0 to queue and mark entrance as visited.
* While we don't reach an exit and queue still has cells, pop the first cell from queue. Suppose its distance from entrance is curr_distance. We check its neighboring cells in all four directions, if it has an unvisited neighbor cell:
* If this neighbor cell is an exit, return its distance from the starting position, curr_distance + 1, as the nearest distance.
* Otherwise, we mark it as visited, and add it to queue along with its distance curr_distance + 1.
* If we finish the iteration and no exit is found, return -1.