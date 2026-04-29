import java.util.*;
public class AntiCheat {
    static void antiCheatSystem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tab Switch : ");
        int tab = sc.nextInt();
        System.out.println("Idle Time");
        int Idle= sc.nextInt();
        if(tab >3 || Idle >= 5){
            System.out.println("Cheating Suspected");
        }
        else{
            System.out.println("Cheating Not Suspected");
        }
    }
    public static void main(String[] args){
        antiCheatSystem();
    }
    
}
