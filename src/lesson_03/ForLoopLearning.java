package lesson_03;

public class ForLoopLearning {

    public static void main(String[] args) {
        int index = 0;
        for(; index < 5; index++){
            System.out.printf("Number is %d\n", index);
        }
        System.out.println("Index value after  the loop: " + index);

        for (; ;) {
            System.out.println("Hello");  // Infinite loop

            for (int index_1 = 0; index_1 < 5 ; ){
                System.out.println(index_1); // Infinite loop
            }
        }
    }

}
