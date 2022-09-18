package lesson_03;

public class LoopFlowControlKeywords {

    public static void main(String[] args) {

        // Skip 1 lan lap
        for (int number = 0; number < 5; number++) {
            if (number == 3) continue;;
            System.out.println(number);
        }

        // Thoat ra khoi vong lap
        for (int number = 0; number < 5; number++) {
            if (number == 3) break;;
            System.out.println(number);
        }
    }
}
