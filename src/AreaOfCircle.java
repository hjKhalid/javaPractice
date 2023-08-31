import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float radius = in.nextFloat();
        float areaOfCircle= areaOfCircle(radius);
        System.out.println("Area of Circle:"+" "+areaOfCircle);
    }
    static  float areaOfCircle(float r){
        float area= 3.14f*r*r;
        return area;

    }
}
