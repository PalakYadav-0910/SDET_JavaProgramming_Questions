package sdet_programming_ques;

public class SumOfDigitsOfNumber_08 {

    public static void main(String[] args) {

        //Sum of Digits in a Number
        int num = 123456;
        int sum = 0;

        while(num>0){
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println("Sum of digits in a number are : " + sum);
    }
}
