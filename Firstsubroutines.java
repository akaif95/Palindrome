package firstsubroutines;
import java.util.Scanner;

//-----------------------------------------------------------------------------------------------------------------------//



public class Firstsubroutines {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        String userString;
        
        System.out.println("Enter a word/sentence to see if it is a palindrome!");
        userString = userInput.nextLine();
        
        //These next 2 lines modify the word being stripped of spacing and also in reverse order
        String strippedString = modifyString(userString);
        String editedString = findReverseString(strippedString);
        
        //Outputs the word both reversed and stripped
        System.out.println("Stripped Word: " + strippedString);
        System.out.println("Reversed Word: " + editedString);
        
        //Use the .equals() not ==
        if (strippedString.equals(editedString)) {
            System.out.println("The word is a palindrome!");
        } else {
            System.out.println("The word is not a palindrome!");
        }
        

        
    }
    //-----------------------------------------------------------------------------------------------------------------------//
    public static String findReverseString(String str) {
        String reverse;
        int i;
        reverse = "";
        
        for (i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
        
    }
    //-----------------------------------------------------------------------------------------------------------------------//
    
    public static String modifyString(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");    
        return str;
           
    }
    
    
    
    
    
  //-----------------------------------------------------------------------------------------------------------------------//  
    
}
