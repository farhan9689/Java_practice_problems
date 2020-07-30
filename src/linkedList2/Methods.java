package linkedList2;

public class Methods {
	private int size;
	private Node start;
	public Methods() {
		size=0;
		start=null;
	}

	public void insertFirst(int num){
		Node n = new Node();
		n.setData(num);
		n.setNext(start);
		start=n;
		size++;
	}//inFirst
	
	public void insertLast(int data){
		Node t;
		Node n = new Node();
		n.setData(data);
		t=start;
		if(t==null)
			insertFirst(data);
		else{
			while(t.getNext()!=null)
				t=t.getNext();
			
			t.setNext(n);
			size++;
		}
	}//last
	
	public void insertAnywhere(int data,int pos){
		Node t;
		if(pos==1)
		insertFirst(data);
		else if(pos==size+1)
			insertLast(data);
		else if(pos>1 && pos<=size){
			Node n = new Node();
			t=start;
				t=t.getNext();
				n.setNext(t);
				n.setData(data);
				t.setNext(n);
				size++;
			
		}
	}//any
	public void deleteFirst(){
		Node t;
		t= start;
		start=t.getNext();
		size--;
	}//delFirst
	public void deleteLast(){
		Node t;
		t=start;
		for(int i=0; i<size-1;i++)
			t=t.getNext();
		t.setNext(null);
		size--;
	}//delLast
	
	public void deleteAny(int pos){
		Node t1 , t2;
		t1=start;
		if(isEmpty())
			System.out.println("this list is empty");
		else if(pos==1)
			deleteFirst();
		else if(pos==size)
			deleteLast();
		else if(pos>1 && pos<size){
			for(int i=1;i<pos-1;i++)
				t1=t1.getNext();
			
				t2=t1.getNext();
				t1.setNext(t2.getNext());
			
			size--;
			
		}
	}
	public boolean isEmpty(){
		if(start==null)
			return true;
		else
			return false;
	}//isEmpty
	
	public int listSize(){
		return size;
	}
	public void showList(){
		Node t;
		t=start;
		if(isEmpty()){
			System.out.println("this list is empty");
		}
		else{
			for(int i=0; i<size;i++){
				System.out.println(" "+t.getData());
				t=t.getNext();
			}
		}
	}
}
