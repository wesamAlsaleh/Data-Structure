package com.avocadogroup.datastructure.exercises;

import com.avocadogroup.datastructure.stacks.SingleArrayStack;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Stack;

@Component
public class ETwo {
    public static boolean validParentheses(String s) {
        // convert the string into array of chars
        var chars = s.toCharArray();

        // create stack instance
        var stack = new SingleArrayStack(chars.length);

        // create a hashmap to put the correct pairs
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        // iterate over the array if chars
        for (char ch : chars) {
            // if the character is an open parentheses add it to the stack
            if (map.containsValue(ch)) {
                stack.push(ch);
            }
            // else it's a closing pair, so compare it with the last element
            else {
                // if the last opening pair does not equal the correct opening pair for the current char
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
