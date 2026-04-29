import java.util.Scanner;
public class Traffic_fine_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fine =0;
        System.out.println("Enter the speed of the vehicle : ");
        int speed = sc.nextInt();
        if(speed >= 80 && speed <=100 ){
            fine += 500 ;
        }
        else if(speed > 100){
            fine += 1000 ;
        }
        System.out.println("Is the repeated or not?(true or false):");
        boolean repeated = sc.nextBoolean();
        if(repeated == true ){
            fine *= 2;
        }
        System.out.println("The total fine is : " + fine);
    }
    
}
