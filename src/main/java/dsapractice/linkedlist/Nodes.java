package dsapractice.linkedlist;

public class Nodes {
	int value;
	Nodes next;

	public Nodes(int value, Nodes next) {
		this.value = value;
		this.next = next;

	}

	public static void main(String[] args) {
		Nodes nodes = new Nodes(0, null);
		nodes.addNode();
		
		int size = nodes.getSize();
	    System.out.println(size);
	    
		 
	}

	public void addNode() {
		this.next = new Nodes(23, new Nodes(43, new Nodes(11, new Nodes(93, null))));
		Nodes current = next;

		while (current != null) {
			System.out.println(current.value);
			current = current.next;
		}

	}
	
	public int getSize() {
        int size = 0;
        Nodes current = this;
        while (current != null) {
            size++;
            current = current.next;
        }
       return size;
    }

}