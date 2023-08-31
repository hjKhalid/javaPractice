import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name= in.nextLine();
        greeting(name);
    }
    static  void  greeting(String name){
        System.out.println("Hello"+ " "+name);

    }
}
