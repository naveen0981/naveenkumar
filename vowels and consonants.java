import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch='a'; 
        //char
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowels");
        }
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Consonant");
        }
    }
}
