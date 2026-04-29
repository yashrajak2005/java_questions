import java.util.*;
public class Discount_eligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the total amount");
        int amount = sc.nextInt();
        boolean user = false;
        double discount =0.0;
        double Finalamount;
        if(amount >= 5000){
            discount += 0.2;
        }
        else if (amount >= 2000){
            discount += 0.1;
        }
        else{
            Finalamount = amount;
        }
        System.out.println("Are you an Premium user? (true/false)");
        user = sc.nextBoolean();
        if(user == true){
            discount += 0.05;
        }
        else{
            discount +=0;
        }
        Finalamount = amount - (amount * discount);
        System.out.println("The final amount : " + Finalamount);
        

    }
    
}
