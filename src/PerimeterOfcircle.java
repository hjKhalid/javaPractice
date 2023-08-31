import  java.util.Scanner;
public class PerimeterOfcircle {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of Circle ");
    float radius = in.nextFloat();
    float perimeter = perimeterOfCircle(radius);
    System.out.println("The perimeter of Circle :"+perimeter);
    }
    static float perimeterOfCircle(float r){
        return  2*3.14f*r;
    }
}
