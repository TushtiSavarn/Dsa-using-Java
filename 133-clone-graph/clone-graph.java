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

    private Map<Node, Node> visitedNodes = new HashMap<>();

    public Node cloneGraph(Node node) {
        return dfs(node);
    }

    private Node dfs(Node node) {
        if (node == null)
            return null;

        // If already cloned, return it
        if (visitedNodes.containsKey(node))
            return visitedNodes.get(node);

        // Clone current node
        Node clonedNode = new Node(node.val);

        // Store before exploring neighbors (important for cycles)
        visitedNodes.put(node, clonedNode);

        // Clone all neighbors
        for (Node neighbor : node.neighbors) {
            clonedNode.neighbors.add(dfs(neighbor));
        }

        return clonedNode;
    }
}