package exercises;

import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args){
        double area;
        double radius;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a radius:");
        radius = in.nextDouble();
        while (radius < 0){
            System.out.println("Do NOT enter a negative number.");
            System.out.println("Enter a radius:");
            radius = in.nextDouble();
        }

        area = 3.14 * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
