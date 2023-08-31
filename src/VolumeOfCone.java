import java.util.Scanner;
public class VolumeOfCone {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cone");
    float radius = in.nextFloat();
        System.out.println("Enter the height of cone ");
    float height = in.nextFloat();
   float volume = volumeOfCone( radius,height);
        System.out.println("Volume of Cone :"+volume);
    }
    static float volumeOfCone(float r, float h){
        return  3.14f*r*r*h/3;
    }
}
