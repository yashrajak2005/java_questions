import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units which is used:");
        int units = sc.nextInt();
        double bill;
        if (units <=100) {
            bill = units * 1.5;
        }
        else if (units <= 200){
            bill = 100 * 1.5 + (units - 100) * 3.5;
        }
        else {
            bill = 100 * 1.5 + 100 *3.5 + (units - 200) * 5;
        }
        bill = bill + 50 ;
        if(bill > 2000){
            bill = bill + bill * 0.1;
        }
        System.out.println("Total bill: " + bill);
        sc.close();
    }
    
}
