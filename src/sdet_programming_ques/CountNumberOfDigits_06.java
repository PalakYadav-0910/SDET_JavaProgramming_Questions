package sdet_programming_ques;

public class CountNumberOfDigits_06 {

    public static void main(String[] args) {

        //Count Number of Digits in a Number

        int num = 123456;
        int count = 0;

        while(num>0){
            num = num /10;
            count++;
        }

        System.out.println("Number of Digits are : " + count);
    }
}
