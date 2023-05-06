import java.util.Scanner;
public class PrintAStringBackwards {
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