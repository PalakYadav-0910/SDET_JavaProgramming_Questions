package sdet_programming_ques;

public class FibonacciSeries_10 {

    public static void main(String[] args) {

        //Generate Fibonacci Series - A series of numbers in which each number (Fibonacci
        // Number) is the sum of two preceding numbers.
        // 0 1 1 2 3 5 8 13 21 34.....

        int n1 = 0, n2 = 1, sum = 0;
        System.out.print(n1 + "\t" + n2);

        for(int i = 0; i<=10; i++){

            sum = n1 + n2;
            System.out.print("\t" + sum);

            n1 = n2;
            n2 = sum;

        }
    }
}
