package abstractClasses;

	abstract class A{
		
		 abstract void show();
		 
		 void test(){
			 System.out.println("Inside A");
		 }
	}
	
	 abstract class B extends A {
		abstract void display();
		
		void test(){
			super.test();
			System.out.println("Inside B");
		}
	}
	 
	 class C extends B{     //concrete class
		 void show(){
			 
		 }
		 void display(){
			 
		 }
	 }


public class Demo {
	
	public static void main(String[] args) {
		
		A ob = new C();
		ob.test();
	}

}
