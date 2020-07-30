package swapping;

public class Exm1 {
	
	int swap_helper(int a,int b, int diff){
		if(diff==0){
			System.out.print(a);
			System.out.print(" "+b);
	        return 0;
		}
	    diff--;
	    a--;
	    b++;
	    return swap_helper(a,b,diff);
	    
	}
	
	void swap(int a, int b){
		if(a>b)
	        swap_helper(a,b,a-b);
	    else
	        swap_helper(b,a,b-a);
	}
	
	public static void main(String[] args) {
		Exm1 ob = new Exm1();
		ob.swap(10, 15);
	}

}
