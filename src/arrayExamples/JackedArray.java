package arrayExamples;

public class JackedArray {

	public static void main(String[] args) {
		
		int a[][] = {                      // jacked array example
				{1,2,3,4},
				{5,6,7,8,10},
				{9}
		            };

	for(int i=0; i<a.length; i++){ //------------------------------->//there is a main precaution to be taken
		for(int j=0; j<a[i].length;j++){                          // size of each row is different thats why we have to get
			                                                      // the size of each row for each iteration.
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	}
	}


