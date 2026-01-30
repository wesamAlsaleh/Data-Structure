package com.avocadogroup.datastructure;

import com.avocadogroup.datastructure.exercises.ETwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

import static com.avocadogroup.datastructure.exercises.EOne.rotate;

import static com.avocadogroup.datastructure.exercises.ETwo.validParentheses;

@SpringBootApplication
public class DataStructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataStructureApplication.class, args);

        // Ex1
//        int[] e1 = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println("Output: " + Arrays.toString(rotate(e1, 3, 7)) + " Expected: [5, 6, 7, 1, 2, 3, 4]");
//        int[] e2 = {-1, -100, 3, 99};
//        System.out.println("Output: " + Arrays.toString(rotate(e2, 2, 4)) + " Expected: [3, 99, -1, -100]");

        // Ex2
//        System.out.println("Output: " + validParentheses("()") + " Expected: true");
//        System.out.println("Output: " + validParentheses("()[]{}") + " Expected: true");
//        System.out.println("Output: " + validParentheses("(]") + " Expected: false");
//        System.out.println("Output: " + validParentheses("([])") + " Expected: true");
//        System.out.println("Output: " + validParentheses("([)]") + " Expected: false");

        // Ex3


    }

}
