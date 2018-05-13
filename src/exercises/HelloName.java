package exercises;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String name;
        String greeting;
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        name = in.next();
        greeting = "Hello " + name;
        System.out.println(greeting);
    }

}
