package manualLinkedList;

public class LinkedList {
	Node start=null;
	int size=0;
	public void insertAtFirst(int val){
		Node n;
		n=new Node();
		start=n;
		size++;
	}
	public void insertAtLast(int val){
		Node n,t;
		n= new Node();
		n.setData(val);
		t=start;
		if(t==null)
			start=n;
		else{
			while(t.getNext()!=null)
				t=t.getNext();
			t.setNext(n);
			size++;
				
		}
	}//last
	
	public void insertAtPosition(int pos , int data){
		Node n,t;
		n=new Node();
		n.setData(data);
		t=start;
		if(pos==1)
			insertAtFirst(data);
		else if(pos>size)
			insertAtLast(data);
		else if(pos>1 && pos<=size){
			for(int i=1; i<pos-1; i++)
				t=t.getNext();
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		
	}//pos
	
	void deleteFirst(){
		if(isEmpty())
			System.out.println("list is already empty");
		else 
			start = start.getNext();
		size--;
	}
	
	public void deleteLast(){
		Node t;
		t=start;
		if(start==null)
			System.out.println("already empty");
		else if(size==1){
		start=null;
		size--;
		}
		else{
		for(int i=1;i<size;i++)
			t=t.getNext();
		t.setNext(null);
		size--;
		}
		}
	
	public void deleteAtPos(int pos){
		Node t,t1;
		t=start;
		if(pos==1)
			deleteFirst();
		else if(pos==size)
			deleteLast();
		else {
			for(int i=1; i<pos-1;i++)
				t=t.getNext();
			t1=t.getNext();
			t.setNext(t1.getNext());
			size--;
			
		}
	}
	
	public boolean isEmpty(){
		if(start==null)
			return true;
		else
			return false;
	}
	
	public int getSize(){
		return size;
	}

}
