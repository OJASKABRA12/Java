package cam.company;

import java.util.Scanner;

public class length_of_your_name {
    public length_of_your_name() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give us your name:");
        String name = sc.nextLine();
        System.out.print("Length of your name is ");
        int value = name.length();
        System.out.print(value);
        System.out.println(" words");
    }
}