import java.util.*;
public class StudentResult {
    static void studentResultAnalyzer(){
        int total = 0;
        int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        boolean fail = false ;
        for(int i=0;i<n;i++){
            int marks = sc.nextInt();
            if(marks<33){
                fail = true;
                break;
            }
            else{
                total+=marks;
            }
        }
        if(fail==true){
            System.out.println("Fail");
        }
        else{
            int avg = total/n;
            if(avg>=75){
                System.out.println("Distinction");
            }
            else if(avg>=60 && avg<75){
                System.out.println("First class");
            }
            else if(avg>=50 && avg<60){
                System.out.println("Second");
            }
            else{
                System.out.println("Pass");
            }
        }

    }
    public static void main(String[] args){
        studentResultAnalyzer();
        
    }
    
}
