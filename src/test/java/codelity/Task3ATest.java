package codelity;

import org.junit.Assert;
import org.junit.Test;

public class Task3ATest {
    @Test
    public void checkStackTest() {
        Task3A task2 = new Task3A();
        String S = "()())())(";
        Assert.assertEquals(5, task2.solution(S));
        System.out.println(task2.solution(S));
    }

    @Test
    public void checkStackTest2() {
        Task3A task2 = new Task3A();
        String S = "(())))(";
        Assert.assertEquals(4, task2.solution(S));
        System.out.println(task2.solution(S));
    }

    @Test
    public void checkStackTest3() {
        Task3A task2 = new Task3A();
        String S = "((()))(";
        Assert.assertEquals(3, task2.solution(S));
        System.out.println(task2.solution(S));
    }

    @Test
    public void checkStackTest4() {
        Task3A task2 = new Task3A();
        String S = "()))))))))))))))))";
        System.out.println(S.length());
        Assert.assertEquals(17, task2.solution(S));
        System.out.println(task2.solution(S));
    }

    @Test
    public void checkStackTest5() {
        Task3A task2 = new Task3A();
        String S = "(((((((((((((((()";
        System.out.println(S.length());
        Assert.assertEquals(1, task2.solution(S));
        System.out.println(task2.solution(S));
    }
}
