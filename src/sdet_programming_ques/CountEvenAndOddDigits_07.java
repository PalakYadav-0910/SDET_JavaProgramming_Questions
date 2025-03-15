package sdet_programming_ques;

public class CountEvenAndOddDigits_07 {

    public static void main(String[] args) {

        //Count Even and Odd Digits in a Number
        int num = 1234567;
        int odd_digits = 0;
        int even_digits = 0;

        while(num>0){

            int rem = num % 10;

            if(rem % 2 == 0){
                even_digits++;
            }
            else{
                odd_digits++;
            }
            num = num / 10;
        }

        System.out.println(String.format("Number of even digits are : %d and odd " +
                "digits are : %d", even_digits, odd_digits));
    }
}
