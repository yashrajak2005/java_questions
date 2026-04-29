import java.util.*;
public class Login_attempt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "Yash";
        String password = "1234";
        int attempts = 0;
        boolean loggedIn = false;
        while (attempts <3){
            System.out.println("Enter the username :");
            String ipUsername = sc.nextLine();
            System.out.println("Enter the password :");
            String ipPassword = sc.nextLine();
            System.out.println("Attempts : ");
            if(ipPassword.equals(password) && ipUsername.equals(username)){
                System.out.println("successful");
                loggedIn = true;
                break;
            } else {
                System.out.println("wrong");
                attempts++;
            }
            
            }
            if(loggedIn==false){
                System.out.println("Account locked.");
            }
}
}