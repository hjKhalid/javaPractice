import java.util.Scanner;
public class CalculateNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2=in.nextInt();
        String operator = in.nextLine();
        int value=calculation(num1,num2,operator);
        System.out.println(value);
    }
    static int calculation(int a,int b,String oprand){
        int sum=1 ;
        if(oprand=="+"){
            sum =a+b;
        }
        else if(oprand=="-"){
            sum = b-a;
        }
        else if(oprand=="*"){

            sum = b*a;

        } else if (oprand=="/") {

            sum = b/a;

        }
        return sum;
    }
}
