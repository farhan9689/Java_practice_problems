package searching;

import java.util.Scanner;

public class LinearSearch {

	public boolean sort(int[] a, int n) {
	for(int i=0; i<=a.length-1;i++){
		if(a[i]==n){
			return true;
		}
	
	}
	return false;
	}

	public static void main(String[] args) {
	LinearSearch ob = new LinearSearch();
		Scanner s = new Scanner(System.in);
		int[] a = {20,15,65,85,5,8,19};
		System.out.println(ob.sort(a,1));
	}

}
