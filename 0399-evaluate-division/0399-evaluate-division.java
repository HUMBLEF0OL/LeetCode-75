class Solution {
    /*
        crazy question
    */
    public void dfs(String source, String destination, HashMap<String,HashMap<String,Double>> graph, HashSet<String> visited, double tempAnswer, double []answer){
        // return if the current node is already visite
        if(visited.contains(source))return;
        
        visited.add(source);
        // return if source becomes equal to destination
        if(source.equals(destination)){
            answer[0] = tempAnswer;
            return;
        }
        
        for(Map.Entry<String,Double> entry: graph.get(source).entrySet()){
            String newSource = entry.getKey();
            double currentPathValue = entry.getValue();
            dfs(newSource, destination, graph,visited,tempAnswer*currentPathValue,answer);
        }
        
    }
    public HashMap<String,HashMap<String,Double>> buildGraph(List<List<String>> equations, double[] values){
        HashMap<String,HashMap<String,Double>> graph = new HashMap<>();
        for(int i =0 ;i< equations.size();i++){
            String divident= equations.get(i).get(0);
            String divisor = equations.get(i).get(1);
            double currentEqValue = values[i];
            
            // create 2 entries in hashmap one for divisor and one for divident
            graph.putIfAbsent(divisor,new HashMap<>());
            graph.putIfAbsent(divident,new HashMap<>());
            
            // now set the values as : a->b(a/b) and b->a(b/a)
            graph.get(divident).put(divisor,currentEqValue);
            graph.get(divisor).put(divident,1.0/currentEqValue);;
        }
        return graph;
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // create graph
        HashMap<String,HashMap<String,Double>> graph = buildGraph(equations, values);
        double[] resultArr = new double[queries.size()];
        for(int i =0;i<queries.size();i++){
            String divident = queries.get(i).get(0);
            String divisor = queries.get(i).get(1);
            // case1: when divident or divisor doesn't exists in our graph
            if(!graph.containsKey(divident) || !graph.containsKey(divisor)){
                resultArr[i] = -1.0;
            } else{
                // create a visited array that will be used in traversal
                HashSet<String> visited = new HashSet<>();
                double tempAnswer = 1.0;
                // creating array so that calling function can update its value instead of returning
                double[] answer = {-1.0};
                dfs(divident,divisor,graph,visited,tempAnswer,answer);
                resultArr[i] = answer[0];
            }
        }
        
        return resultArr;
    }
}