package fibonacci;

import java.util.Scanner;

public class Test {
	
	int fib(int n){
		if(n<1)
			return 0;
		else 
			if(n==1||n==2)
			return n-1;
		else 
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		Test ob = new Test ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of series");
		int n = sc.nextInt();
		for(int i=1 ; i<=n; i++){
			System.out.print(ob.fib(i)+" ");
		}
	}

}
