import java.util.Scanner;
public class PerimeterOfEquilaterTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side");
        float side = in.nextFloat();
        float perimeter = perimeterOfEquilateralTriangle(side);
        System.out.println("Perimeter of equilateral triangle : "+ perimeter);
    }
    static  float perimeterOfEquilateralTriangle(float side){
        return 3*side;
    }
}
