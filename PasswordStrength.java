/* 

*/
import java.util.*;
public class PasswordStrength {
    static void checkPassword(String password){
        int stringLength = password.length();
        int charCount = 0;
        int numCount = 0;
        int specialCharCount = 0;
        int upperCaseCount = 0;
        for(int i = 0; i<stringLength ; i++){
            char ch = password.charAt(i);
            if(Character.isLetter(ch)){
                charCount++;
                if(Character.isUpperCase(ch)){
                upperCaseCount++;
            }
            }
            else if(Character.isDigit(ch)){
                numCount++;
            }
            else{
                specialCharCount++;
            }
            
        }
        if(charCount >= 8 && numCount >= 1 && specialCharCount >= 1 && upperCaseCount >= 1){
            System.out.println("Password is strong");
        }
        else if(charCount<8){
            if(upperCaseCount<1){
                System.out.println("Missing Special character, length<8");
            }
            else{
                System.out.println("Char Length<8");
            }
            
        }
        else if(numCount<1){
            System.out.println("Missing Number");
        }
        else if(specialCharCount<1){
            System.out.println("Missing Special Character");
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = sc.nextLine();
        checkPassword(password);
    }
    
}
