package sdet_programming_ques;

import java.util.Scanner;

public class LargestOfThreeNumbers_09 {

    public static void main(String[] args) {

        //Find largest of 3 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = sc.nextInt();

        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        System.out.println("Enter Third Number :");
        int c = sc.nextInt();

        //Logic 1 - Using Logical Operator (&&)
        if(a>b && a>c){
            System.out.println(a + " is largest number.");
        }
        else if (b>a && b>c) {
            System.out.println(b + " is largest number.");
        }
        else{
            System.out.println(c + " is largest number.");
        }

        //Logic 2 - Using Ternary Operator
        int largest = a>b?a:b;
        int largest2 = c>largest?c:largest;

        // int largest2 = c>(a>b?a:b?)?c:(a>b?a:b)

        System.out.println(largest2 + " is largest number.");
    }
}
