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

class Solution {

 
 Map<Node, Node> nodeMap = new HashMap<>();

    public Node cloneGraph(Node originalNode) {


        
    if (originalNode == null)
    {
        return null;
    }

    if (nodeMap.containsKey(originalNode))
    {
        Node clonedNode = nodeMap.get(originalNode);
        return clonedNode;
    }


    Node clonedNode = new Node(originalNode.val);
    nodeMap.put(originalNode, clonedNode);

    for (Node neighbor : originalNode.neighbors)
    {
         Node clonedNeighbor = cloneGraph(neighbor);
         clonedNode.neighbors.add(clonedNeighbor);

    } 


    return clonedNode;

    }
           
}
