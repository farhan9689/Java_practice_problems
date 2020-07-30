package finalKeyword;


final class test{ //cannot be inherited
	
}

 class example{
	 final public void display(){
		 System.out.println("Inside display of class example");
	 }
 }
public class Demo extends example {
	final int i =5; //(constant)
	final int j;
	Demo(){
		//i=10; error cannot be changed
		j=10; //works fine because j was not initialized, and it is compulsory for the constructor to initialized
	         // final variables otherwise it gives compilation error.
	}
	
	final void show(){
		System.out.println("Inside show");
	}
	
//	 void display(){    cannot override the final method of example
//		
//	}
	public static void main(String[] args) {
		
		
	}

}
