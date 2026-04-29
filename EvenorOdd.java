import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int EvenCount = 0;
        int OddCount = 0;
        System.out.println("Enter a number");
        do{
            num = sc.nextInt();
            if(num == 0){
                break;
            }
            else if(num % 2 == 0){
                EvenCount++;
            }
            else{
                OddCount++;
            }
        }while(num !=0);
        System.out.println("Even numbers: " + EvenCount);
        System.out.println("Odd numbers: " + OddCount);

    }
}
