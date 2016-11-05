package codelity;

import org.junit.Test;

/**
 * Created by anujparikh on 11/4/16.
 */
public class Task1Test {
    @Test
    public void checkStackTest() {
        Task1 task1 = new Task1();
        int[] input = {1, 1, 2, 3, 3, 3};
        int k = 3; // error
        System.out.println(task1.solution(input, k));
    }

    @Test
    public void checkStackTest2() {
        Task1 task1 = new Task1();
        int[] input = {1, 1, 2, 3, 3, 4};
        int k = 1; // error
        System.out.println(task1.solution(input, k));
    }

    @Test
    public void checkStackTest3() {
        Task1 task1 = new Task1();
        int[] input = {1,1,1,1,1,1,1};
        int k = 1; // error
        System.out.println(task1.solution(input, k));
    }

    @Test
    public void checkStackTest4() {
        Task1 task1 = new Task1();
        int[] input = {0,0,0,0,0,0};
        int k = 0; // error
        System.out.println(task1.solution(input, k));
    }
}
