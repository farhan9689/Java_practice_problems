package wraperClasses;

public class Waraper {


	public static void main(String[] args) {
		
		int i= 5;  // primitive Variable
		
		Integer ob = new Integer(i);   // boxing   OR   Wraping 
		
		// Both  'i' variable and 'ob' object are same and give same output --> primitive variables are faster...
		
		System.out.println(i);   // o/p--> 5
		System.out.println(ob);  // o/p--> 5
		
		Integer j = new Integer(10);
		
		int k = j.intValue();   //   Unboxing   OR   Unwraping
		
		System.out.println(j);    //  o/p--> 10
		System.out.println(k);    //  o/p--> 10
		
		// -------------------NOW---------------------
		
		int value = 20;
		Integer a = value;//Line(1)  // Auto-Boxing  OR  Auto-Wraping --> "new Integer(value)" This part is executed by java in
		                      //                                                         backGround..
		
		// that line(1) one is same as --> Integer a = new Integer(value);
		
		
		int updated_value=value;//Line(2)    // Auto-Unboxing   OR  Auto-Unwraping  
		
		
		//Line (2) is same as --> int updated_value = int.value(value);
		//but java does that part for us in background..
		
		
		/*
		 * 'parse'  method of Integer class
		 * 
		 * 
		 */
		String s= "123";
		
		//int val = s; //can not convert from String to int
		
		int val = Integer.parseInt(s);
		
		System.out.println(val);
		/*
		 * we can convert the above string s into any of other data type  
		 *  parse to --> Float 
		 *  parse to --> Double
		 *  parse to --> Short
		 *  parse to --> Byte
		 *  parse to --> Boolean
		 *  parse to --> Long
		 */
	
	}

}
