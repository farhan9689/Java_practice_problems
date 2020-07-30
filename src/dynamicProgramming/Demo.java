package dynamicProgramming;

import java.util.Scanner;

public class Demo {
	
	int fib(int n, int[] memo){
		
		if(memo[n]!=0){
			return memo[n];
		}
		else if(n==1 || n==2 ){
			return 1;
		}
		else{
			int result = fib(n-1,memo)+fib(n-2,memo);
			memo[n]=result;
			return result;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int n  = sc.nextInt();
		int memo[] = new int[n+1];
		Demo ob = new Demo();
		System.out.println(ob.fib(n, memo));
	}

}
