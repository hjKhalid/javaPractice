import java.util.Scanner;
public class FactorOfGivenInputNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number To Find the Factor");
        int Number = in.nextInt();
        factor(Number);

    }
    static void factor(int N){
        for(int i =1;i<=N;i++){
            if(N%i==0){
                System.out.println(i);
            }

        }
    }
}
