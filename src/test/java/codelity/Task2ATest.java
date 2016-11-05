package codelity;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anujparikh on 11/4/16.
 */
public class Task2ATest {
    @Test
    public void checkStackTest() {
        Task2A task2 = new Task2A();
        int[] A = {60, 80, 40};
        int[] B = {2, 3, 5};
        int M = 5;
        int X = 2;
        int Y = 200;
        Assert.assertEquals(5, task2.solution(A, B, M, X, Y));
    }

    @Test
    public void checkStackTest2() {
        Task2A task2 = new Task2A();
        int[] A = {40, 40, 100, 80, 20};
        int[] B = {3, 3, 2, 2, 3};
        int M = 3;
        int X = 5;
        int Y = 200;
        Assert.assertEquals(6, task2.solution(A, B, M, X, Y));
    }

    @Test
    public void checkStackTest3() {
        Task2A task2 = new Task2A();
        int[] A = {200, 40, 100, 80, 20};
        int[] B = {3, 3, 2, 2, 3};
        int M = 3;
        int X = 5;
        int Y = 200;
        Assert.assertEquals(8, task2.solution(A, B, M, X, Y));
    }

    @Test
    public void checkStackTest4() {
        Task2A task2 = new Task2A();
        int[] A = {200};
        int[] B = {3};
        int M = 3;
        int X = 5;
        int Y = 200;
        Assert.assertEquals(2, task2.solution(A, B, M, X, Y));
    }

    @Test
    public void checkStackTest5() {
        Task2A task2 = new Task2A();
        int[] A = {1, 199};
        int[] B = {3, 3};
        int M = 3;
        int X = 5;
        int Y = 200;
        Assert.assertEquals(2, task2.solution(A, B, M, X, Y));
    }
}
