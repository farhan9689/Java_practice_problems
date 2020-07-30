package dynamicProgramming;

public class BottomUP_print {

		void fib(int n){
		int bottom_up[] = new int[n+1];
		bottom_up[1]=1;
		bottom_up[2]=1;
		for(int i=3; i<=n; i++){
			int result = bottom_up[i-2]+bottom_up[i-1];
			bottom_up[i]=result;
		}
		 for(int a : bottom_up){
			 System.out.print(a+" ");
		 }
	}
	
	public static void main(String[] args) {
		BottomUP_print ob = new BottomUP_print();
		ob.fib(9);
		
	}

}
