package string;

public class Test {


	public static void main(String[] args) {
			String s = "hello from java ";
			char c1 = s.charAt(1);
			System.out.println(c1);
			
			for(int i=s.length()-1; i>=0;i--){
				System.out.print(s.charAt(i));
			}
	}

}
