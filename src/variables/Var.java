package variables;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Var {


	public static void main(String[] args) {
		
	//	long d = 50000000000; error-> out of range of integer and we didn't use 'l' in value.
		long d = 500000000; // considered as integer because we didn't used 'l' in last and it is in range of integer.
		long e = 5000000000l; //considered as long -> 8 bytes
		int a = 5; // 4 bytes -> 32 bits -> -2,147,483,648 to 2,147,483,648
		short b = 5; // 2 bytes -> 16 bits -> -32768 to 32768 
		byte c = 5; // 1 byte -> 8 bits -> -128 to 127
		
		float f = 5.5f; // 4 bytes 
		
		Double df = new Double("3.14159");
		Double df1 = BigDecimal.valueOf(df).setScale(2,RoundingMode.HALF_UP).doubleValue();
		System.out.println(df1);
		
		double g = 3.14159; // 8 bytes11
		//System.out.println(g);
		
		
		char h = 66; // we can assign integer value to char
		//System.out.println(h);// output-> B (ascii value will be out put)
		h++; // we can also apply increment operator to char variables.
		//System.out.println(h);
		
		double g1 = 5;//double can store integer value but it will convert it to float like 5.0 and it is known as 'implicit conversion'
		
		int k = (int)5.6; // explicit conversion("type casting") -> output-> 5    ->(.6 will be ignored)
	}

}
