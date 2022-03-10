/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/


    // Not my original implementation but the one that I settled on after reviewing Depth First Search Algorithms
    // TODO add the Queue implementation. 
class Solution {
    // Declare a hashmap of visited nodes outside the function.
    // This way we can use the cloneGraph() recursively
    private Map<Node, Node> visited = new HashMap<>(); 
        
    public Node cloneGraph(Node node) {
        
        if(node == null){
            return node;
        }
        
        // This prevents us from looping infinitely in the for each loop
        // The 
        if(visited.containsKey(node)){
            return visited.get(node);
        }
        
        // Clone the current node's value and put it in the visited HashMap
        Node clone = new Node(node.val);
        visited.put(node, clone);
        
        // Search through the current node's neighbors
        // Add the neighbors diving down 1 node deeper
        for(Node n : node.neighbors){
            clone.neighbors.add(cloneGraph(n));
        }

        return clone;
    }
}