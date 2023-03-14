package cam.company;

import java.util.Scanner;

public class percentage_calculator{

    public static void main(String[] args) {

        System.out.println("Give all your marks in CBSE out of 100");

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me marks of first subject 1");

        int mark1 = sc.nextInt();

        System.out.println("Give me marks of first subject 2");

        int mark2 = sc.nextInt();

        System.out.println("Give me marks of first subject 3");

        int mark3 = sc.nextInt();

        System.out.println("Give me marks of first subject 4");

        int mark4 = sc.nextInt();

        System.out.println("Give me marks of first subject 5");

        int mark5 = sc.nextInt();

        float total = ((mark1 + mark2 + mark3 + mark4 + mark5)/500.0f)*100;

        System.out.print("Total persantage of marks:%");

        System.out.println(total);

    }

}
