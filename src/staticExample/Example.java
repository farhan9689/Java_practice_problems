package staticExample;

class Emp{
	int id;
	int salary;
	static String ceo;
	
	static{// static block is used to initialize static variables and it executes only ones when class is loaded.
		ceo = "ashraf";
	}
	
	void display(){
		System.out.println("id:" + id+" salary:"+salary+"  ceo:"+ceo);
	}
}


public class Example {


	public static void main(String[] args) {
		Emp farhan = new Emp();
		farhan.id = 101;
		farhan.salary = 25000;
		
		Emp mirza  = new Emp();
		mirza.id = 102;
		mirza.salary = 50000;
		
		
		farhan.display();
	}

}
