package fibonacci;

public class UsingRecursion {

	static long fib(long n) 
    { 
		if(n>=3){
			return fib(n-1)+fib(n-2);	
		}
		else{
			return 1;
  		}
    } 
	public static void main(String[] args) {
		
		 long n = 20; 
		    System.out.println(fib(n)); 
	}

}
