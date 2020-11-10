import static org.junit.Assert.*;

import org.junit.Test;

public class lcaTest {

	@Test
	public void testParentChild() {
		lca tree = new lca(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7);
        
        assertEquals(2,tree.findLCA(2, 4));
	}
	
	@Test
	public void testSelf() {
		lca tree = new lca(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7);
        
        assertEquals(2,tree.findLCA(2, 2));
		
	}
	
	@Test
	public void testBothChild() {
		lca tree = new lca(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7);
        
        assertEquals(2,tree.findLCA(4, 5));
		
	}
	

}
