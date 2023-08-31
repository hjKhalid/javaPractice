import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side length of equilateral triangle");
        float side = in.nextFloat();
        float area = areaOfEquilateral(side);
        System.out.println("the area of equilateral : "+area);
    }
    static  float areaOfEquilateral(float side){
        return  0.433012702f*side*side;
    }
}
