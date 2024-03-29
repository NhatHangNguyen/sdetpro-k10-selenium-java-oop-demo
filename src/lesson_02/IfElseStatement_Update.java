package lesson_02;

import java.util.Scanner;

public class IfElseStatement_Update {

    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrival time: ");
        int arrivalTime = scanner.nextInt();

        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        System.out.println("1.Dat xe ra");
        System.out.println("2. Chay toi quan");

        if (isHeOnTime)
        {
            System.out.println("\t----> Let's talk!");
        }
        else
        {
            System.out.println("\t----> Write a letter!");
        }

        System.out.println("3.Dat xe ra");
        System.out.println("4. Chay ve nha");

        /*// Ternary operator | Toan tu ba ngoi
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME ? true : false;
        if(arrivalTime == EXPECTED_TIME){
            isHeOnTime = true;
        } else {
            isHeOnTime = false;
        }*/

    }
}
