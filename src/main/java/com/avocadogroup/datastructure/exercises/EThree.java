package com.avocadogroup.datastructure.exercises;

import com.avocadogroup.datastructure.stacks.SingleArrayStack;

public class EThree {

    /**
     * Reverse the provided stack.
     *
     * @param stack Stack to reverse.
     */
    public static void reverseStack(SingleArrayStack stack) {
        // create the reversed stack
        var reversedStack = new SingleArrayStack(stack.size());

        // while the stack is not empty
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }

//        // replace the old stack with the new stack
//        stack = reversedStack;

        // print the reversed stack
        reversedStack.printStack();
    }
}
