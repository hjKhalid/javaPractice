import java.util.Scanner;
public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Height Of Rhombus");
        float height = in.nextFloat();
        System.out.println("Enter the Base of Rhombus");
        float base = in.nextFloat();
        float perimeter= perimeterOfRhombus(height,base);
        System.out.println("the perimeter of RHombus is :"+perimeter);
    }
    static float perimeterOfRhombus(float h,float b){
        return 2*(h+b);
    }
}
