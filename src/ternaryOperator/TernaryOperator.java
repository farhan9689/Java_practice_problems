package ternaryOperator;

public class TernaryOperator {

	public static void main(String[] args) {
		int i = 8;
		int j = 0;
		
		/*
		 * if(i>6)
		 * j=1
		 * else
		 * j=2
		 */
		//we can achieve the above scenario with ternary operator(?:)
		
		/* syntax:->  condition?operation1:operation2 
		 * if condition is true operation1 will be executed otherwise operation2 will be executed 
		 * */
		 j  = i>6?1:2;
		 System.out.println(j);
	
	}

}
