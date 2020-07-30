package arrayExamples;

public class AdvanceFor {


	public static void main(String[] args) {
		
		int a[][] = {                      // jacked array example
				{1,2,3,4},
				{5,6,7,8,10},
				{9}
		            };
		
		for(int k[] : a){                   // Display 2d array with help of advance "for loop"
			for(int j : k){
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
