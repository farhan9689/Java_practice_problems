package dynamicProgramming;

public class Bottom_up {

	int fib(int n){
		
		if(n==1 || n==2){
			return 1;
		}
		int bottom_up[] = new int[n+1];
		bottom_up[1]=1;
		bottom_up[2]=1;
		for(int i=3; i<=n; i++){
			int result = bottom_up[i-2]+bottom_up[i-1];
			bottom_up[i]=result;
		}
		return bottom_up[n];
	}
	
	public static void main(String[] args) {
		Bottom_up ob = new Bottom_up();
		System.out.println(ob.fib(6));
	}

}
