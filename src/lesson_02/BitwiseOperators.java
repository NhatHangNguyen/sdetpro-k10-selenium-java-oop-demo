package lesson_02;

public class BitwiseOperators {
    public static void main(String[] args) {
        if(getFirstNum() !=0 && getSecondNum() !=0){
            System.out.println("Calculating...");
        }
    }
    // &&: hai vế đều đúng đ/v so sánh 2 dấu && nếu phát hiện vế 1 sai thì vế 2 sẽ k bao giờ đc so sánh nữa
    // ||: chỉ cần 1 trong 2 vế đúng , nếu vế 1 đúng rùi thì k cần care tới vế 2 nữa
    // & and |: bất chấp vế 1 đúng hay sai, nhưng vế 2 vẫn được so sánh

    private static int getFirstNum(){
        System.out.println("Calling  getting first number!");
        return 0;
    }

        private static int getSecondNum(){
        System.out.println("Calling  getting second number!");
        return 2;
    }
}
