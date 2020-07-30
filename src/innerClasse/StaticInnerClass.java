package innerClasse;

class Outer1{
	
	static int a=10;
	
	static void display(){
		System.out.println("Inside display of Outer");
	}
	
	static class Inner{ //static inner class used with the associated outer class.
		
		void display(){
			System.out.println("Inside display of inner class");
		}
	}
}


public class StaticInnerClass {

	public static void main(String[] args) {
		Outer1 ob = new Outer1 ();
		Outer1.display();
		
		Outer1.Inner ob1 = new Outer1.Inner();
		
		ob1.display();

	}

}
