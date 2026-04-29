import java.util.*;
public class AtmWithdrawal{
    static void Atm_Withdrawal_logic(int Balance, int Amount){
        if(Balance >= Amount){
            Balance -= Amount;
            if(Balance>=1000){
                System.out.println("Transaction Successful : " + Balance);
            }
            else{
                System.out.println("Transaction Failed: Minimum balance violation");
            }
        }
        else{
            System.out.println("Transaction Failed: Balance is less than amount to be withdrawn");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Balance : ");
        int Balance = sc.nextInt();
        System.out.println("Enter the amount of withdrawal : ");
        int Amount = sc.nextInt();
        Atm_Withdrawal_logic(Balance, Amount);

    }
}