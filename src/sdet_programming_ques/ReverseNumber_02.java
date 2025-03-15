package sdet_programming_ques;

import java.util.Scanner;

public class ReverseNumber_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        int num = sc.nextInt();  //1234

        //Logic 1 - Using Algorithm
        /*int rev = 0;

        while(num!=0){
            rev = rev * 10 + num % 10;  //4
            num = num / 10;  //123
        }*/

        //Logic 2 - Using StringBuffer Class
        /*StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();*/

        //Logic 3 - Using StringBuilder Class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();

        System.out.println("Reversed Number is : " + rev);
    }
}
