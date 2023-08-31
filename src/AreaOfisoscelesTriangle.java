import  java.util.Scanner;
public class AreaOfisoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of Triangle");
        float base = in.nextFloat();
        System.out.println("Enter the Hypo of Triangle");
        float hypo = in.nextFloat();
        double area = areaOfIsoscelesTriangle(base,hypo);
        System.out.println("the area isosceles of triangle:"+" "+area);


    }
    static  double areaOfIsoscelesTriangle(float b,float h){
        double area = 0.5f*b*Math.pow((Math.pow(h,2)-Math.pow(b,2)/4),1/2f);
        return area;
    }
}
