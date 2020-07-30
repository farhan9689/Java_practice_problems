package sorting;

import java.util.Scanner;

public class LinearSort {
	
	public int[] sort(int[] a){
		int temp;
		for(int j=0; j<a.length-1; j++)
		{
		for(int i=j+1; i<a.length; i++){
			if(a[j]>a[i]){
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of array to be sort");
		int size  = s.nextInt();
		int[] a= new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++){
			a[i]=s.nextInt();
		}
		LinearSort ob = new LinearSort();
		int[] sorted =ob.sort(a);
		for(int i=0;i<sorted.length;i++){
			System.out.print(" "+sorted[i]);
		}
	}

}
