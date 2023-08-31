import  java.util.Scanner;
public class AreaOfRohmbus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Diagonal 1");
        float diagonal1 = in.nextFloat();
        System.out.println("Enter the Diagonal 2");
        float diagonal2 = in.nextFloat();
        float area = areaRhombus(diagonal1,diagonal2);
        System.out.println("area of rhombus : "+area);

    }
    static  float areaRhombus(float d1,float d2){
        float area = d1*d2/2;
        return area;
    }
}
