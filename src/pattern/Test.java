package pattern;

import java.util.Scanner;

/*
 *       ***1
 *       **212
 *       *32123
 *       4321234
 *        32123
 *         212
 *          1
 */
public class Test {
	public static void main(String[] args) {
		int count=0;
		System.out.println("enter any one digit number ");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=n-1; j>=i; j--){
				System.out.print("*");
			}//j
	
			for( count=i; count>=1; count--){
				
				System.out.print(count);   
			}//count 
			if(i>1){
				for(int k=2;k<=i;k++){
					System.out.print(k);
				}
			}//if
			
	System.out.println();
		}//i
		int count2;
		for(int i=1; i<=n-1;i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}//j
						
				for(count2=n-i; count2>=1; count2--){
					System.out.print(count2);
				}
			int z=2;
				for(int k=n-2; k>=i; k--)  {
				
				System.out.print(z);
			    z++;
			}
			
			
		 System.out.println();
		}//i
	}
}
