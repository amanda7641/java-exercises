package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSumEvens {
    public static int sumEvens(ArrayList<Integer> lists){
        int count = 0;
        for (Integer number: lists) {
            if (number % 2 == 0) {
                count = count + number;
            }
        }
        return count;
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,5,8,13,21,34,55,89));


        int count = sumEvens(numbers);
        System.out.println("The sum of all the even numbers is: " + count);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
