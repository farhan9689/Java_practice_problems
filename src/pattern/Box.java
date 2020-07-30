package pattern;

import java.util.Scanner;

public class Box {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int n = s.nextInt();
		for (int j = 1; j <= n; j++) {
			if(j==1||j==n){
			for (int i = 1; i <= n; i++) {
				System.out.print("$");
			}
			System.out.println();
			}//if
			else{
				for (int i = 1; i <= n; i++) {
					if(i==1||i==n)
					System.out.print("$");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}

}
