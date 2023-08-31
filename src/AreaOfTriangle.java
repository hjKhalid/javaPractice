import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        float height = in.nextFloat();
        System.out.println("Enter the base of triangle");
        float base = in.nextFloat();
        float area = areaOfTriangle(height,base);
        System.out.println("The area of triangle:"+area);
    }
    static float areaOfTriangle(float h,float b){
        float areaOfTriangle = 0.5f*h*b;
        return  areaOfTriangle;
    }
}
