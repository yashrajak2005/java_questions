import java.util.*;
public class CabFare {
    static void cabFareSystem(int distance , boolean night){
        int fare;
        if(distance<=5){
            fare = distance * 50; 
        }
        else if(distance >5 && distance <=10){
            fare = 5 * 50 + (distance - 5) * 40;
        }
        else{
            fare = 5 * 50 + 5 * 40 + (distance-10) * 30;
        }

        if(night == true){
            fare = fare + fare * 20/100;
        }
        System.out.println("Fare:" + fare);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance");
        int distance = sc.nextInt();
        System.out.println("Night : ");
        boolean night = sc.nextBoolean();
        cabFareSystem(distance, night);

    }
}
