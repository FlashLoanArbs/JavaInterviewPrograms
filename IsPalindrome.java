/*
 * Original:
    
    boolean checkPalindromeString(String input) {
	boolean result = true;
	int length = input.length();

	for (int i = 0; i < length/2; i++) {
		if (input.charAt(i) != input.charAt(length - i - 1)) {
			result = false;
			break;
		}
	}

	return result;
	}
 */




import java.util.Scanner;
public class IsPalindrome{
   public static void main(String[] args){
      
      Scanner scnr = new Scanner(System.in);
      
      String possiblePalindrome = scnr.nextLine();
      
      System.out.println(isPalindrome(possiblePalindrome));
            
   

   }
   
   public static boolean isPalindrome(String word){
      boolean isPalindrome = false;
      String wordReversed = "";
      for (int i = word.length() - 1; i >= 0; --i){
         wordReversed += (word.charAt(i));
      }
      if (wordReversed.equals(word)) {
         isPalindrome = true;
      }
      return isPalindrome;
   }
}
   