package binarySearch;

public class BinarySearch {

	public static boolean binarySearchRecursive(int[] array, int x, int left, int right){
		
		if(left > right){
			return false;
		}
		
		int mid = (left + right)/2; //to overcome the integer overflow issue we can use [left+ ((right - left) /2)]
		if(array[mid]==x){
			return true;
		}else if(x < array[mid]){
			return binarySearchRecursive(array, x, left, mid-1);
		}else{
			return binarySearchRecursive(array, x, mid+1, right);
		}
	}
public static boolean binarySearchRecursive(int[] array, int x){
		return binarySearchRecursive(array, x, 0, array.length - 1);
	}
	
	public static void main(String args[]){
		//recursive implementation 
		int[] array = {20,40,60,80,90};
		BinarySearch ob = new BinarySearch();
		System.out.println(ob.binarySearchRecursive(array,25));
		
		
	}

}
