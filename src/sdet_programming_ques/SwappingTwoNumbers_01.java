package sdet_programming_ques;

public class SwappingTwoNumbers_01 {

    public static void main(String[] args) {

        //Logic 1 - Using Third Variable
        int a =10, b=20;
        System.out.println("Before Swapping values are : " + a + " , " + b);

        /*int temp = a;
        a = b;
        b = temp;*/

        //Logic 2 - Using "+" and "-" Operators, without using third variable
        //a = a + b;   // a=30
        //b = a - b;   // b=10
        //a = a - b;   // a=20

        //Logic 3 - Using "*" and "/" Operators, without using third variable
        //a = a * b;    // a=200
        //b = a / b;    // b=10
        //a = a / b;    // a=20

        //Logic 4 - Using XOR Operator(^), without using third variable
        /*a = a^b;
        b = a^b;
        a = a^b;*/

        //Logic 5 - Using Single statement
        b = a+b-(a=b);

        System.out.println(String.format("After swapping values are %d and %d", a,b));

    }
}
