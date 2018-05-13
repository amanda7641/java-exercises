package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float length;
        float width;
        float area;
        Scanner in = new Scanner(System.in);

        System.out.println("Let's find the area of a rectangle!");
        System.out.println("What is the length of the rectangle?");
        length = in.nextFloat();
        System.out.println("What is the width of the rectangle?");
        width = in.nextFloat();
        area = length*width;

        System.out.println("The area is: " + String.valueOf(area));
    }
}
