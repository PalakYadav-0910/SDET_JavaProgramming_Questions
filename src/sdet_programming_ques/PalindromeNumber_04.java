package sdet_programming_ques;

import java.util.Scanner;

public class PalindromeNumber_04 {

    public static void main(String[] args) {

        //Palindrome Number - A Palindrome Number is a number that remains the same
        // when its digits are reversed. For e.g - 16461

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int num = sc.nextInt();
        int original_num = num;

        int rev = 0;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Reversed Number is : " + rev);

        if(original_num == rev){
            System.out.println(original_num + " - Palindrome Number");
        }
        else{
            System.out.println(original_num + " - Not a Palindrome Number");
        }
    }
}
