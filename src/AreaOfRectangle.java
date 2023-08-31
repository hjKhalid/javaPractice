import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        float length = in.nextFloat();
        System.out.println("Enter the base of rectangle");
        float base = in.nextFloat();
        float area = areaOfRectangle(length,base);
        System.out.println("area of retangle:"+area);


    }
    static  float areaOfRectangle(float h,float b){
        float area = h*b;
        return  area;
    }
}
