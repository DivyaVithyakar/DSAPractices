package dsapractice.BruteForce;

public class Nodes {

	    int value;
	    Nodes next;
	    int size;

	    public Nodes(int value, Nodes next) {
	        this.value = value;
	        this.next = next;
	        this.size = 1; 
	    }

	    public static void main(String[] args) {
	        Nodes nodes = new Nodes(0, null);
	        nodes.addNode();
	        nodes.addNode();
	        nodes.removeFirst();
	        int size = nodes.getSize();
	        System.out.println("Size of the linked list: " + size);
	    }

	    public void addNode() {
	        this.next = new Nodes(23, new Nodes(43, new Nodes(11, new Nodes(93, null))));
	        Nodes current = this.next;

	        // Increment the size for each added node
	        while (current != null) {
	            current.size = this.size + 1;
	            current = current.next;
	        }
	    }

	    public Nodes removeFirst() {
	        if (this.next != null) {
	            Nodes newHead = this.next;
	            newHead.size = this.size - 1;
	            return newHead;
	        } else {
	            return null;
	        }
	    }

	    public int getSize() {
	        return this.size;
	    }
	


}
