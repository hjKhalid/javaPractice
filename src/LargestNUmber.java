import java.util.*;
public class LargestNUmber {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner in = new Scanner(System.in);

        int num1=in.nextInt();
        System.out.println("Enter the second number");
        int num2=in.nextInt();
        int greater = greaterNumber(num1,num2);
        System.out.println(greater+" is greater ");

    }
    static int greaterNumber(int a,int b){
        int greater =0;
        if (a>b){
            greater=a;
        }else {
            greater=b;
        }
        return  greater;
    }
}
