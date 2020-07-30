package que;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Que {
	private static int front, rear, capacity;
	private static int queue[];
	Que(int capacity){
		front = rear = 0;
		this.capacity = capacity;
		queue = new int[this.capacity];
	}
	
	static void enqueue(int data){
		//check queue is full or not 
		if(capacity==rear){
			System.out.println("\n Queue is Full");
			return;
		}
		else{
			queue[rear]=data;
			rear++;
		}
		return;
	}//enqueue body end
	
	//function to delete element from queue
	
	static void dequeue(){
		//check if queue is empty or not
		if(front == rear){
			System.out.println("\n Queue is empty");
			return;
		}
		//shift all the element from index 2 till rear to the right by one 
		else{
			for(int i=0; i<rear-1; i++){
				queue[i]=queue[i+1];
			}
			//store 0 at rear indicating there's no element
			if(rear<capacity){
			queue[rear]=0;
			}
			rear--;
		}
		return;
	}//dequeue body end
	
	// print queue elements 
    static void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
             return;
        } 
  
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d <-- ", queue[i]); 
        } 
        return;
        
    }//queue display body end
    
 // print front of queue 
    static void queueFront() 
    { 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
             return;
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
        return;
    }//queueFront body end  
 
	
	public static void main(String[] args) {
		boolean flag = true;
		Scanner s= new Scanner(System.in);
		
		Que q = new Que(4);
		while(flag)
		{
		System.out.println(" \n 1: add element");
		System.out.println(" 2: delete element");
		System.out.println(" 3: print queue");
		System.out.println(" 4: print Front ");
		System.out.println(" 5: exit");
		System.out.println(" Enter you'r choice");
		int choice = s.nextInt();
		
		
		switch(choice){
		case 1: 
			System.out.println("enter element to add");
			int element = s.nextInt();
			q.enqueue(element);
			break;
			
		case 2:
			q.dequeue();
			
			break;
			
		case 3:
			q.queueDisplay();
			break;
		case 4:
			queueFront();
			break;
		case 5:
			flag = false;
			break;
		default :
				System.out.println("Invalid choice");
			
		}
		}
		}

}
