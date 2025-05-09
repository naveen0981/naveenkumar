import java.util.Stack;
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Stack<Integer> a=new Stack<>();
        boolean yes =true;
        Scanner sc=new Scanner(System.in);
        while(yes){
            int b=sc.nextInt();
            if(b>0){
                a.push(b);
            }
            else{
                yes=false;
            }
        }
        System.out.println(a);
}
}
