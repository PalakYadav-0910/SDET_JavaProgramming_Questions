package sdet_programming_ques;

import java.util.Scanner;

public class PalindromeString_05 {

    public static void main(String[] args) {

        //Palindrome String - A Palindrome String is a String that remains the same
        //when its characters are reversed. For e.g - MADAM

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();
        String org_str = str;

        String rev = "";
        int len = str.length();

        for(int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String is : " + rev);

        if(org_str.equals(rev)){
            System.out.println(org_str + " - Palindrome String");
        }
        else{
            System.out.println(org_str + " - Not a Palindrome String");
        }
    }
}
