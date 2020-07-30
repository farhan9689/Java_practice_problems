package bariQuickSort;

import java.util.Arrays;

public class BariQuick {

	public int partition(int a[], int low, int high)
	{
		int temp1,temp2;
		int pivot=a[low];
		int i=low , j=high;
		while(i<j){
			do{
				i++;
			}while(a[i]<=pivot);
			do{
				j--;
			}while(a[j]>pivot);
			if(i<j){
				temp1=a[i];
				a[i]=a[j];
				a[j]=temp1;
			}
		}	
		temp2=a[low];
		a[low]= a[j];
		a[j]=temp2;
		return j;
		 
	}

	public void sort(int a[],int low,int high) {
		if(low<high-1){
		int index = partition(a,low,high);
		
		sort(a,low,index);
		sort(a,index+1,high);
		}
	}

	public static void main(String[] args) {
		int[] a = {10,16,3,12,15,6,3,10,5};
		BariQuick ob = new BariQuick();
		ob.sort(a,0,a.length);
		System.out.println(Arrays.toString(a));
	}

}
