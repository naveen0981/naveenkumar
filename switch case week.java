import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    int day=sc.nextInt();
    
    switch(day){
        case 1:
            System.out.print("Monday");
            break;
    
        case 2:
            System.out.print("Tuesday");
            break;
        case 3:
            System.out.print("Wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5:
            System.out.print("Friday");
            break;
        case 6:
            System.out.print("Saturday");
            break;
        default:
        System.out.print("Enter the correct number of day");
        break;
    }
}
}
            
            
            
            
            
            
            
            
            
    
