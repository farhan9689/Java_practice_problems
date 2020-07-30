package fibonacci;

public class Fibbo {

	void method1(int n) {
		int x = 0, y = 1, result = 0;
		if(n==1)
			System.out.print(x+" ");
		else{
		System.out.print(x + " " + y + " ");
		for (int i = 2; i <= n-1; i++) {

			result = x + y;
			System.out.print(" " + result);
			x = y;
			y = result;

		}
		}
	}

	public static void main(String[] args) {
		Fibbo ob = new Fibbo();
		ob.method1(5);
	}

}
