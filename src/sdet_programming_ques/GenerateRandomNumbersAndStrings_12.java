package sdet_programming_ques;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomNumbersAndStrings_12 {

    public static void main(String[] args) {

        // Approach 1 - Using Random Class

        Random rand = new Random();

        //Generating random numbers betweeen 1 to 10.
        int rand_int = rand.nextInt(100);
        System.out.println(rand_int);

        //Don't need to pass range, By default range 0.0 and less than 1.0
        double rand_dbl = rand.nextDouble();
        System.out.println(rand_dbl);

        // Approach 2 - Using Math Class
        System.out.println(Math.random());

        // Approach 3 - Using Apache Commons-Lang API
        String rand_num = RandomStringUtils.randomNumeric(10);
        System.out.println(rand_num);

        String rand_str = RandomStringUtils.randomAlphabetic(10);
        System.out.println(rand_str);

    }
}
