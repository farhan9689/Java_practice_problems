package quickJoe;

import java.util.Arrays;
import java.util.Random;

public class quickSort {
	
	public void sort(int a[]){
		sort(a,0,a.length-1);
	}
	
	private void sort(int a[],int low , int high){
		if(low<high){
			int p = partition(a,low,high);
			sort(a,low,p-1);
			sort(a,p+1,high);
		}
	}
	
	private void swap(int a[],int index1, int index2){
		int temp = a[index1];
		a[index1]= a[index2];
		a[index2] = temp;
	}
	
	//return random pivot index between low and high inclusive
	
	private int getPivot(int low, int high){
		Random rand = new Random();
		return rand.nextInt((high-low)+1)+low;
	}
	
	//moves all the n<pivot to left and all n>pivot to the right side then returns pivot index
	private int partition(int a[], int low, int high){
		swap(a, low, getPivot(low,high));
		int border=low+1;
		for(int i=border;i<=high;i++){
			if(a[i]<a[low]){
				swap(a,i,border++);
			}
		}
		swap(a,low,border-1);
		return border-1;
	}
	
	public static void main(String[] args) {
		quickSort ob = new quickSort();
		int a[] = {11,9,55,4,66,12,1,11,15};
		System.out.println(Arrays.toString(a));
		ob.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
