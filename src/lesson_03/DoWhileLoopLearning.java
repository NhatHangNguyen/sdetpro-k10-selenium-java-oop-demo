package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoopLearning {

    public static void main(String[] args) {

        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(10);
        System.out.println("randomNumber:"+ randomNumber);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your number: ");
            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber){
                System.out.println("Hooray!!!");
                break;
            }
            guessingTime++;
        } while (guessingTime < 3);

        if(guessingTime ==3){
            System.out.println("Chuc ban may man lan sau!!!");
        }
    }
}
