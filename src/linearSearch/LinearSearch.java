package linearSearch;

import java.util.Scanner;

public class LinearSearch {

		boolean search(int[] a, int num){
			for(int i=0; i<a.length; i++){
				if(a[i]==num)
					return true;
			}
			return false;
		}
	
	public static void main(String[] args) {
	    boolean flag = false;
		while(true){
	    LinearSearch ob = new LinearSearch();
		Scanner s = new Scanner(System.in);
		int[] a = {10,20,44,8,75,9};
		System.out.println("Enter the number to be searched");
		int num = s.nextInt();
		flag = ob.search(a,num);
		if(flag)
			System.out.println("number is found");
		else
			System.out.println("the number is not found");
	}
	}
}
