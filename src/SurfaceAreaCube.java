import  java.util.Scanner;
public class SurfaceAreaCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Side of Cube");
        float side = in.nextFloat();
        float surfaceAreaOfCube = surfaceAreaOfCube(side);
        System.out.println("SurfaceAreaOfCube :" + surfaceAreaOfCube);
    }
    static  float surfaceAreaOfCube(float s){
        return  6*s*s;
    }
}
