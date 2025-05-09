import java.util.Stack;
public class Main{
    public static void main(String[] args){
        Stack<Integer> ECE = new Stack<>();
        ECE.push(42);
        ECE.push(65);
        ECE.push(12);
        ECE.push(14);
        ECE.push(6);
        while(!ECE.isEmpty()){
            System.out.println(ECE.pop());
        }
       

}
}
