package lesson_02;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        // Right operand: Tinh toan ben phai truoc roi assign ket qua cho ben trai
        int total = myNum1 + myNum2;
        int total1 = myNum1 - myNum2;
        int total2 = myNum1 * myNum2;
        int total3 = myNum1 / myNum2;
        System.out.println("Total: " + total);

        // Total is %d: Print with format
        System.out.printf("Total is %d\n", total);
        System.out.printf("Total is %f\n", 3.14f);
        System.out.printf("Boolean value is %b\n", true);
        System.out.printf("Character is %s\n", 'a');

        float myFloatNum = 3/2f;
        System.out.println(myFloatNum);

        System.out.println(5 / 2); // chia lay phan nguyen
        System.out.println(5 % 2); // chia lay phan du
    }
}
