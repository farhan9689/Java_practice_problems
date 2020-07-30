package fibonacci;

public class SimpleRecursion {
	
	int fact(int n){
	
		if(n>=1){
			return n*fact(n-1);
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args) {
	SimpleRecursion ob = new SimpleRecursion();
	System.out.println(ob.fact(5));
	
	}

}
