package binarySearch;

public class BinarySearchItrative {
	
	public static boolean binarySearchIterative(int[] array, int x){
		int left =0;
		int right = array.length-1;
		while(left<=right){
			int mid = left + ((right-left)/2);
			if(array[mid]==x){
				return true;
			}else if(x< array[mid]){
				right= mid-1;
			}else{
					left = mid+1;
				}
			}
		return false;
		}
	

	public static void main(String[] args) {
		int[] array = {20,40,60,80,90};
		BinarySearchItrative ob = new BinarySearchItrative();
		System.out.println("Status: "+ob.binarySearchIterative(array,10));
	}

}
