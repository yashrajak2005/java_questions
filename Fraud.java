import java.util.*;
public class Fraud {
    static void fraudDetection(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount : ");
        int Amount = sc.nextInt();
        System.out.println("LocationMatch : ");
        String Location = sc.next();
        System.out.println("Transactions :");
        int Transaction = sc.nextInt();
        if(Amount > 50000 && Location.equalsIgnoreCase("No") || Transaction>3){
            System.out.println("Fraud Detected");
        }
        else{
            System.out.println("Fraud not detected");
        }
        sc.close();
    }
    public static void main(String[] args){
        fraudDetection();
    }
}
