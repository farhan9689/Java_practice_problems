package abstractClasses;

public class WhyAbstract {

	void show(Integer i){         //this method only accept integers 
		System.out.println(i);
	}
	//Both are using wrapper classes
	void disDouble(Double d){    // this method on accept double values 
		System.out.println(d);
	}
	
	void disAny(Number n){     //now this method can accept any number because it is super class of all the wrapping classes
		System.out.println(n); // and the Number class is a Wrapper class which has all the abstract method for the subclasses
	}                          // to implement compulsory..
	public static void main(String[] args) {

		WhyAbstract ob = new WhyAbstract();
		ob.show(20);
		ob.disDouble(3.14);
		ob.disAny(3.3f);
		ob.disAny(23);
	}

}
