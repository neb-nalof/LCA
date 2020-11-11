import static org.junit.Assert.*;

import org.junit.Test;

public class lcaTest {

	@Test
	public void testChildParent() {
		lca dag = new lca();
		Node node = new Node(1);
		dag.root = node;
		node = new Node(2);
		dag.root.addNode(node);
		node = new Node(4);
		dag.root.get(0).addNode(node);
		node = new Node(3);
		dag.root.addNode(node);
		dag.root.get(0).get(0).addNode(node);
		node = new Node(5);
		dag.root.get(0).addNode(node);
		dag.root.get(1).addNode(node);
		
		assertEquals(2,dag.findLCA(2,4));
	}
	
	@Test
	public void testSelf() {
    lca dag = new lca();
		Node node = new Node(1);
		dag.root = node;
		node = new Node(2);
		dag.root.addNode(node);
		node = new Node(4);
		dag.root.get(0).addNode(node);
		node = new Node(3);
		dag.root.addNode(node);
		dag.root.get(0).get(0).addNode(node);
		node = new Node(5);
		dag.root.get(0).addNode(node);
		dag.root.get(1).addNode(node);
		
		assertEquals(2,dag.findLCA(2,2));
	}
	
	@Test
	public void testChildren() {
		lca dag = new lca();
		Node node = new Node(1);
		dag.root = node;
		node = new Node(2);
		dag.root.addNode(node);
		node = new Node(4);
		dag.root.get(0).addNode(node);
		node = new Node(3);
		dag.root.addNode(node);
		dag.root.get(0).get(0).addNode(node);
		node = new Node(5);
		dag.root.get(0).addNode(node);
		dag.root.get(1).addNode(node);
		
		assertEquals(2,dag.findLCA(4,5));
	}
}
