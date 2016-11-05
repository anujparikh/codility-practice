package codelity;

import org.junit.Test;

/**
 * Created by anujparikh on 11/4/16.
 */
public class Task2Test {

    @Test
    public void checkStackTest() {
        Task2 task2 = new Task2();
        String input = "13 DUP 4 POP 5 DUP + DUP + -";
        System.out.println(task2.solution(input));
    }
}
