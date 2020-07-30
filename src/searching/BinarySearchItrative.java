package searching;

import java.util.Scanner;

public class BinarySearchItrative {

	public int search(int num,int []numbers){
		int left , right, mid;
		left=0;
		right=numbers.length-1;
		while(left<=right){
			mid=(left+right-1)/2;
			if(num==numbers[mid])
				return mid;
		    if(numbers[mid]<num)
				left=mid+1;
		    else
				right=mid-1;
		}
		return -1;  
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinarySearchItrative t = new BinarySearchItrative();
		
		int numbers[] = {10,30,40,60,80};
		System.out.println("enter number to be searched");
		int num=s.nextInt();
		int result = t.search(num,numbers);
		if(result==-1)
			System.out.println("element is not present");
		else
			System.out.println("element is present at index: "+result);
		
	}

}
