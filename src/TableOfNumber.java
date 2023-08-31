import java.util.*;
public class TableOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = in.nextInt();
         table(number);
    }
    static void table(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }
}
