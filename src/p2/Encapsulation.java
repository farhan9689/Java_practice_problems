package p2;

// Encapsulation -----> binding data to method

 class Test{
	 private String name = "farhan";
	 private	 int age = 24;
		 
		 void setName(String name){
			this.name=name; 
		 }
		 
		 String getName(){
			 return(name);
		 }
		 
		 void setAge(int age){
			this.age = age;
		 }
		 int fetchAge(){
			 return age;
		 }
 
 }


public class Encapsulation {

	public static void main(String[] args) {
		Test t = new Test();
		
		System.out.println(t.getName());
		t.setName("mirza");
		System.out.println(t.fetchAge());

	}

}
