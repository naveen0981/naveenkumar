import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int left=0;
        int right=a.length()-1;
        boolean na=true;
      while(left<right){
          if(a.charAt(left)!=a.charAt(right)){
              na=false;
              break;
          }
          left++;
          right--;
      }
      if(na){
          System.out.println("pallindrome");
      }else{
          System.out.println("not pallidrome");
      }
    }
}
