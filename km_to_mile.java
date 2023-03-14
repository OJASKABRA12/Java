package cam.company;
import java.util.Scanner;
public class km_to_mile {

    public static void main(String[] args) {
   //km_to_mile
        Scanner sc = new Scanner(System.in);
        System.out.println("Give no of km");
        float a = sc.nextFloat();
        System.out.print("No of miles is:");
        float b = ((a)/1000000.0f)*621371;
        System.out.println(b + " mile");
    }
}
