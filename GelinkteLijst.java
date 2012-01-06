package gelinkteLijsten;

public class GelinkteLijst {
	
	
	/**
	 * Alleen de gelinkte lijst heeft toegang tot de node
	 */
	private class Node {
		//Dit is de data die je opslaat
		Object data;
		
		// referenties/pijlen naar de eerste en laatste nodes
		Node next, previous;
		
		Node(Object data){
			this.data = data;
		}
		
		Node(Object data, Node next, Node previous){
			this.data = data;
			this.next = next;
			this.previous = previous;
		}

		public Object getData(){
			return data;
		}
	}	
	
	
	private Node first, last;
	private int size;
	
	
	public GelinkteLijst(){
		this.size = 0;
	}
	
	
	Node getFirst(){
		return first;
	}
	
	
	Node getLast(){
		return last;
	}	
	
	/**
	 * Voeg toe aan de voorkant
	 */
	void insertFirst(Object o){
	
		size++;
		if(first == null){
			first =  new Node(o);
			last = first;
		}else{
			first = first.previous = new Node(o, first, null);
		}
	}

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object o){
		size++;
		if(last == null){
			last = new Node(o);
			first = last;
		}else{
			last = last.next = new Node(o,null,last); 
		}
	}
	
	/**
	 * Voeg toe voor een ander element
	 */
	void insertBefore(Object o, Object before){
		
		if(first != null && first.data.equals(before)){
			first = first.previous = new Node(o, first, null);
			size++;
		}
		else{
			for(Node p = first; p.next != null; p = p.next){
				if(p.next.data.equals(before)){
					p.next = p.next.previous = new Node(o,p.next,p);
					size++;
					break;
				}
			}
		}
	}
	
	/**
	 * Voeg toe na een ander element
	 */
	void insertAfter(Object o, Object after){
			
		if(last != null && last.data.equals(after)){
			last = last.next = new Node(o, null, last);
			size++;
		}
		else{
			for(Node p = last; p.previous != null; p = p.previous){
				if(p.previous.data.equals(after)){
					p.previous = p.previous.next = new Node(o,p,p.previous);
					size++;
					break;
				}
			}
		}
	}

	
	/**
	 * Verwijder een element
	 * @param data
	 */
	void remove(Object data){
		
		for(Node p = first; p != null; p = p.next){
			if(p.data.equals(data)){
				size--;
				if(p.previous != null){
					p.previous.next = p.next;
				}else{
					first = p.next;
				}
				if(p.next != null){
					p.next.previous = p.previous;
				}else {
					last = p.previous;
				}
			}
		}
	}
	
	Object pop(){
		Node p = first;
		remove(first.data);
		return p.data;
	}
	
	Object front(){
		return first.data;
	}
	
	void dequeue(){
		remove(first.data);
	}
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isFirst(Node current){
		if(first.equals(current)){
			return true;
		}
		return false; //dummy
	}
	
	
	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isLast(Node current){
		if(last.equals(current)){
			return true;
		}
		return false; //dummy	
	}
	
	
	/**
	 * Het aantal elementen in de gelinkte lijst
	 * @return
	 */
	int getSize(){
		return size;
	}
	
	String printFirstToLast(){
		String forward = "First to last: ";
		for(Node p = first; p != null; p = p.next){
			if(p.next == null){ 
				forward += "["+p.data+"]";
			}else{
				forward += "["+p.data+"]"+" -> ";
			}
		}
		return forward;
	}

	String printLastToFirst(){
		String reverse = "Last to First: ";
		for(Node p = last; p != null; p = p.previous){
			if(p.previous == null){ 
				reverse += "["+p.data+"]";
			}else{
				reverse += "["+p.data+"]"+" <- ";
			}
		}
		return reverse;
	}

}
