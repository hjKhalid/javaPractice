import java.util.*;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( "Enter the two number");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = sum(a,b);
        System.out.println(sum);
    }
    static int sum(int a, int b){
        return a+b;
    }
}
