package lesson_01;

// Class name => follow the rule: PascalCase (VariableLearning)
// Variable name => snake_case (int my_num = 18; | in python) and camelCase (int myNum = 18; | in Java)

public class VariableLearning {

    public static void main(String[] args) {

        int myIntNum = 18;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        byte myByteNum = 127;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short myShortNum = 128;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        long myLongNum = 10L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        float myFloatNum = 3.14f;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        double myDoubleNum = 3.14D;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        final int MY_CONSTANT = 123;
        // MY_CONSTANT = 234; => cannot assign a value to final variable MY_CONSTANT, cannot re-assign
    }
}

