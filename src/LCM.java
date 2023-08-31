import  java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int lcm = lcm(num);
        System.out.println(lcm);
    }
    static int lcm (int a ){
        int lcmValue=1 ;
        int i=2;
        while (a>1){
//            a%i;
            i++;
        }
        return lcmValue;
    }
}
