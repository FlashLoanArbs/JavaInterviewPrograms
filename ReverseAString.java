/*
 * Original:
 * public class StringPrograms {

		public static void main(String[] args) {
			String str = "123";
	
			System.out.println(reverse(str));
		}
	
		public static String reverse(String in) {
			if (in == null)
				throw new IllegalArgumentException("Null is not valid input");
	
			StringBuilder out = new StringBuilder();
	
			char[] chars = in.toCharArray();
	
			for (int i = chars.length - 1; i >= 0; i--)
				out.append(chars[i]);
	
			return out.toString();
		}
	}
 */

import java.util.Scanner;
public class ReverseAString {
    public static void main(String [] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        String userString = scnr.nextLine();
        
        System.out.println(printStringBackwards(userString));
     
        
    }
    
    public static String printStringBackwards(String word){
        String wordReversed = "";
        for (int i = word.length() - 1; i >= 0; --i){
           wordReversed += (word.charAt(i));
        }
        return wordReversed;
    }
}