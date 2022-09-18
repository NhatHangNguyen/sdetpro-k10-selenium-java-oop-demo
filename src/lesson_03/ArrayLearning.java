package lesson_03;

public class ArrayLearning {

    public static void main(String[] args) {
        final int ARR_LENGTH = 5;
        int[] myIntArr = new int[ARR_LENGTH];

        myIntArr[0] = 1;
        myIntArr[1] = 2;
        myIntArr[2] = 3;
        myIntArr[3] = 4;
        myIntArr[4] = 5;

        for (int index = 0; index < ARR_LENGTH; index++) {
            myIntArr[index] = index++;
        }

        /*
         * arr[0] = 0 --> index = 1 --> index = 2
         * arr[2] = 2 --> index = 3 --> index = 4
         * arr[4] = 4 --> index = 5 --> index = 6
         * */

        for (int index = 0; index < ARR_LENGTH; index++) {
            myIntArr[index] = ++index;
        }

        /*
        * arr[1] = 1 --> index = 2
        * arr[2] = 3 --> index = 4
        * arr[4] = 5 --> index = 6
        * */

        for (int index = 0; index < ARR_LENGTH; index++) {
            System.out.println(myIntArr[index]);
        }

        // In for loop ngược
        for (int index = ARR_LENGTH -1; index >= 0; index--) {
            System.out.println(myIntArr[index]);
        }

        // Enhanced for
        for(int value : myIntArr){
            System.out.println(value);
        }

    }
}
