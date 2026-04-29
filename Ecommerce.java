import java.util.*;
public class Ecommerce {
    static void returnPolicy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Days : ");
        int days = sc.nextInt();
        System.out.println("Defective : ");
        String Defective = sc.next();
        System.out.println("Premium : ");
        String premium = sc.next();

        if(days<=7 || Defective.equalsIgnoreCase("yes")){
            System.out.println("Return Accepted");
        }
        else{
            if(premium.equalsIgnoreCase("yes")){
                System.out.println("Return Accepted");
            }
            else{
                System.out.println("Return Not Accepted");
            }
        }

    }
    public static void main(String[] args){
        returnPolicy();
    }
}
