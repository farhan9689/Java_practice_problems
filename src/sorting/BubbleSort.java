package sorting;

import java.util.Scanner;

public class BubbleSort {

	public int[] sort(int[] a){
		int temp;
		for(int j=0; j<a.length-1; j++)
		{
		for(int i=0; i<a.length-1;i++){
				if(a[i]>a[i+1]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				
		}
		}
		return a;
	}
	
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of array to be sort");
		int size  = s.nextInt();
		int[] a= new int[ size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++){
			a[i]=s.nextInt();
		}
		BubbleSort ob = new BubbleSort();
		int[] sorted =ob.sort(a);
		for(int i=0;i<sorted.length;i++){
			System.out.print(" "+sorted[i]);
	}
	}

}
