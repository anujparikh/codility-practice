package codelity;

import org.junit.Test;

public class Task3Test {

    @Test
    public void checkAscOrderOfArrayWithOneSwapTest() {
//        int [] input = {1,3,3,6,5,5};
//        int [] input = {1,2,3,4,6,8,8,7,9};
        int [] input = {1,2,3,4,5,6,7};
        Task3 task3 = new Task3();
        System.out.println(task3.checkAscOrderOfArrayWithOneSwap(input));
    }
}
