package sorting;

public class QuickSort1 {
	
	int partition(int a[], int start, int end){
		int temp, temp2;
		int pivot = a[end];
		int partitionIndex = start;//set parttion index as start initially
		
		for(int i=start; i<end;i++){
			if(a[i]<=pivot){
				temp = a[i];
				a[i]=a[partitionIndex];
				a[partitionIndex]=temp;
				partitionIndex++;
			}
		}
		temp2=a[partitionIndex];
		a[partitionIndex]=a[end];
		a[end]=temp2;
		return partitionIndex;
	}
	void quickSort(int a[], int start, int end){
		
		if(start<end){
		int partitionindex = partition(a ,start ,end);//calling partition
		quickSort(a,start, partitionindex-1);
		quickSort(a, partitionindex+1, end);
    	}
	}
	
	public static void main(String[] args) {
		
		int[] a = {15,20,10,30,40,50}; 
		QuickSort1 ob = new QuickSort1();
		ob.quickSort(a,0,a.length-1);
		for(int i=0; i<a.length;i++){
			System.out.print(" " +a[i]);
		}
	}

}
