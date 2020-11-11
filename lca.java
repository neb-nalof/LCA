import java.util.ArrayList; 
import java.util.List; 
  
// A Binary Tree node 
class Node { 
    int data; 
    private ArrayList <Node> children = new ArrayList<Node>(); 
  
    Node(int value) { 
        data = value; 
        children = null; 
    } 
    
    public Node get(int i) {
    	return children.get(i);
    }
    
    public int size() {
    	return children.size();
    }
    
    public void addNode(Node a) {
    	ArrayList <Integer> path = new ArrayList<Integer>();
    	if(!lca.findPath(a,data,path))
    		children.add(a);
    }
} 
  
public class lca  
{ 
  
    Node root;
    private List<Integer> path1 = new ArrayList<Integer>(); 
    private List<Integer> path2 = new ArrayList<Integer>(); 
  
    // Finds the path from root node to given root of the tree. 
    int findLCA(int n1, int n2) { 
        path1.clear(); 
        path2.clear(); 
        return findLCAInternal(root, n1, n2); 
    } 
  
    private int findLCAInternal(Node root, int n1, int n2) { 
  
        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) { 
            System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing"); 
            System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing"); 
            return -1; 
        } 
  
        int i; 
        for (i = 0; i < path1.size() && i < path2.size(); i++) { 
              
        // System.out.println(path1.get(i) + " " + path2.get(i)); 
            if (!path1.get(i).equals(path2.get(i))) 
                break; 
        } 
  
        return path1.get(i-1); 
    } 
      
    // Finds the path from root node to given root of the tree, Stores the 
    // path in a vector path[], returns true if path exists otherwise false 
    static boolean findPath(Node root, int n, List<Integer> path) 
    { 
        // base case 
        if (root == null) { 
            return false; 
        } 
          
        // Store this node . The node will be removed if 
        // not in path from root to n. 
        path.add(root.data); 
  
        if (root.data == n) { 
            return true; 
        }
        for(int i=0;i< root.size();i++) {
	        if (root.get(i) != null && findPath(root.get(i), n, path)) {
	            return true; 
	        } 
        }
        // If not present in subtree rooted with root, remove root from 
        // path[] and return false 
        path.remove(path.size()-1); 
  
        return false; 
    } 
  
} 