package codelity;

import java.util.EmptyStackException;
import java.util.Stack;

public class Task2 {
    public int solution(String s1) {
        Stack<Integer> integerStack = new Stack<>();
        String[] array = s1.split(" ");
        for (String anArray : array) {
            try {
                if (new Task2().isInteger(anArray)) {
                    integerStack.push(Integer.parseInt(anArray));
                } else {
                    switch (anArray.toLowerCase()) {
                        case "pop":
                            integerStack.pop();
                            break;
                        case "dup":
                            int temp = integerStack.pop();
                            integerStack.push(temp);
                            integerStack.push(temp);
                            break;
                        case "+":
                            int temp1 = integerStack.pop();
                            int temp2 = integerStack.pop();
                            integerStack.push(temp1 + temp2);
                            break;
                        case "-":
                            int top = integerStack.pop();
                            int second = integerStack.pop();
                            integerStack.push(top - second);
                            break;
                    }
                }
            } catch (EmptyStackException e) {
                return -1;
            }

        }
        return integerStack.pop();
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
