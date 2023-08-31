import java.util.Scanner;
public class ConvertingRupeeIntoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of rupee");
        int rupee = in.nextInt();
        int usd = convertingUSD(rupee);
        System.out.println(usd+"USD");

    }
    static int convertingUSD(int rup){
        return rup/82;
    }
}
