import java.util.*;
public class DynamicPrice {
    static void dynamicPriceEngine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Base : ");
        int base = sc.nextInt();
        System.out.println("Demand :");
        String Demand = sc.next();
        System.out.println("Weekend :");
        String Weekend = sc.next();
        if(Demand.matches("high")){
            base += base *0.2;
            if(Weekend.matches("yes")){
                base += base *0.1;
            }
        }
        System.out.println("Final Price : " + base);

        
    }
    public static void main(String[] args){
        dynamicPriceEngine();
    }
    
}
