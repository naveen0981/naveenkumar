import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int nk=0;
        while(b!=0){
            if(b==0){
                b=nk;
                nk=0;
            }
            nk+=b%10;
            b=b/10;//100/10=10 10/10=1,rem=0;
            
        }
        System.out.println(nk);
    }
}
