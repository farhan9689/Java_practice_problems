package opratorDemo;

public class Oprator {


	public static void main(String[] args) {
		int m = 5;
		int n = 10;
		n +=m;  /* this is similar to n =n+m;  */  
		/* 
		 * now  n +=3; this can be one case and it is vali
		 * 
		 *  and n++; is similar to n+=1; and it is similar to n = n+1;
		 */
		System.out.println(n);
		
		/*  ---- pre-increment v/s post-increment  ----------*/
		int a=4;
		int b=5;
		
		a=b++;
		System.out.println(a);
		System.out.println(b);
		
		//and a=++b; will give output -> 6
		
				
	}

}
