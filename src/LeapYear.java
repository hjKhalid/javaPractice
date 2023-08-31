import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Year Know is the leapyear");
        int year = in.nextInt();
        System.out.println(leapyear(year));
    }
    static boolean leapyear(int year){
        boolean leapYear;
        leapYear = year % 4 == 0;
        return leapYear;
    }
}
