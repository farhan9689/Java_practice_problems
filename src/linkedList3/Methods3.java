package linkedList3;

public class Methods3 {
	private int size;
	private Node3 start;
	public Methods3() {
		size = 0;
		start = null;
	}
	
	void insertFirst(int data){
		Node3 n= new Node3();
		n.setNext(start);
		start=n;
		start.setData(data);
		size++;
	}
	
	void insertLast(int data){
		Node3 t;
		t= start;
		Node3 n = new Node3();
		for(int i=0; i<size-1;i++){
			t=t.getNext();
		}
		t.setNext(n);
		n.setData(data);
		size++;
	}
	
	void insertAnywhere(int data, int pos){
		
		if(pos<size&&pos>size+2)
			System.out.println("Invalid pos");
		else if(pos==1)
			insertFirst(data);
		else if(pos==size+1)
			insertLast(data);
		else{
			Node3 n = new Node3();
			Node3 t;
			t=start;
			for(int i=1;i<pos-1;i++){
				t=t.getNext();
			}
			
			n.setNext(t.getNext());
			t.setNext(n);
			n.setData(data);
			size++;	
		}
	}
	
	boolean deleteFirst(){
		Node3 t;
		t = start;
		start = t.getNext();
		size--;
		return true;
		
	}
	
	boolean deleteLast(){
		Node3 t;
		t = start;
		for(int i=0; i<size-1;i++){
			t=t.getNext();
		}
		t.setNext(null);
		size--;
		return true;
	}
	
	boolean deleteAny(int pos){
		if(pos<size&&pos>size)
			System.out.println("Invalid position");
		else if(pos==1){
			deleteFirst();
			return true;
		}
		else if(pos==size){
			deleteLast();
			return true; 
		}
		else{
			Node3 t, t1;
			t=start;
			for(int i=1; i<pos-1;i++){
				t=t.getNext();
			}
			t1=t.getNext();
			t.setNext(t1.getNext());
			size--;
			return true;
		}
		return false;
	}
	
	void showList(){
		Node3 t;
		t=start;
		System.out.println("List is:");
		for(int i=0; i<size;i++){
			System.out.print(" "+t.getData());
			t = t.getNext();
		}
	}

}
