package lesson_02;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int c = ++a + b++;

        /*
         * prefix > right operand > assign result into left operand > postfix
         * a = 2
         * b = 3
         * c = 4
         */

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
