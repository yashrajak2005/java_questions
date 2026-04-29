import java.util.*;
public class TrainTicket {
    static void trainTicketBooking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seats:");
        int seats = sc.nextInt();
        System.out.println("Vip:");
        String Vip = sc.next();
        if(seats>0){
            System.out.println("Ticket Confirmed");

        }
        else{
            if(Vip.equalsIgnoreCase("yes")){
                System.out.println("Ticket Confirmed");
            }
            else{
                System.out.println("Waitlist");
            }
        }
    }
    public static void main(String[] args){
        trainTicketBooking();
    }
    
}
