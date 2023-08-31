import java.util.Scanner;
public class AreaOfParlellogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of parlellogram");

        float base = in.nextFloat();
        System.out.println("Enter the height of Parlellogram");
        float height = in.nextFloat();
        float area = areaOfParllelogram( base,height);
        System.out.println("area of parlellogram :" +area);
    }
    static  float areaOfParllelogram(float base,float height){
        float area = base*height;
        return  area;
    }
}
