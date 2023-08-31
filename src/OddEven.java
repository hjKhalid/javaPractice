import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num1= in.nextInt();
//        int num2= in.nextInt();

        String status = oddEven(num1);
        System.out.println(status);
    }
    static String oddEven(int a){
        String status = "";
        if(a%2==0){
            status ="Even";
        }
        else{
            status="Odd";
        }
        return  status;
    }
}
