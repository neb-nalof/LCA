package lca;
import java.util.ArrayList;

public class lca <Key extends Comparable<Key>, Value>{
	
	private class Node{
		private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right, parent;  // left and right subtrees and parent node
        private int N;             // number of nodes in subtree

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
	}

	public static void main(String[] args) {
		

	}
	
	
	public Node loCA(Node a, Node b) {
		ArrayList<Node> first = new ArrayList<Node>();
		ArrayList<Node> second = new ArrayList<Node>();
		Node temp = a;
		for (int i=0; i<2; i++) {
			while(temp!=null) {
				if(i == 0)
					first.add(temp);
				else second.add(temp);
				temp=temp.parent;
			}
			temp = b;
		}
		
		for(int i = 0; i < first.size(); i++) {
			for (int j = 0 ; j< second.size(); j++) {
				if(first.get(i)==second.get(j))
					return first.get(i);
			}
		}
		return null;
		
	}
	
	
}



