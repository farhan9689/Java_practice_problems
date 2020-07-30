package frequencyOfCharacter;

public class Test {

	
	public static void main(String[] args)throws Exception { 
		
		String s = "AaaBccDcc";
		int small[] = new int[26];
		int capital[] = new int[26];
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)>=65 && s.charAt(i)<=90){
				capital[s.charAt(i)-65]++;
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122){
				small[s.charAt(i)-97]++;
			}
		}
		for(int i=0; i<small.length; i++){
			if(small[i]>0){
				System.out.println((char)(i+97)+"->"+small[i]);
			}	
		}
		for(int i=0; i<capital.length; i++){
			if(capital[i]>0){
				System.out.println((char)(i+65)+"->"+capital[i]);
			}
		}
	}

}
