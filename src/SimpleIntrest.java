import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float principle = in.nextInt();
        System.out.println("Enter the rate");
        float rate= in.nextInt();
        System.out.println("Enter the time period");
        int time = in.nextInt();
        float simpleIntreast= simpleIntrest(principle,rate,time);
        System.out.println(simpleIntreast);
    }
    static float simpleIntrest(float p,float r,int t){
        float SI= p*r*t;
        return SI;
    }
}
