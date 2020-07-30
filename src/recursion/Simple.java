package recursion;

public class Simple {
	int fact(int n){
		if(n<=1){
			return 1;
		}
		else
			return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		/*itrartive approac
		int n=5;
		for(int i=n-1;i>=1;i--){
		n = n*i;	
		}
		System.out.println(n);
		*/
		Simple ob = new Simple();
		System.out.println(ob.fact(10));
	}

}
