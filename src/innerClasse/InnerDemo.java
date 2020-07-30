package innerClasse;


class Outer{
	
	int a=5;
	 void display(){
		 System.out.println("inside display of outer class");
	 }
	 
	 class Inner{// TYPE: member class   it looks like  --> "Outer$Inner.class" in the directory 
		 void display(){
			 System.out.println("inside display of inner class");
		 }
	 }
}



public class InnerDemo {

	
	
	public static void main(String[] args) {
		
		Outer ob = new Outer();
		ob.display();
		Outer.Inner ob1 = ob.new Inner();
		ob1.display();
	}

}
