package codelity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by anujparikh on 11/4/16.
 */
public class Task2A {
    public int solution(int[] A, int[] B, int M, int X, int Y) {

        Set<Integer> stops = new HashSet<>();
        List<Integer> peopleInLift = new ArrayList<>();
        Integer totalWeightInLift = 0;
        int totalStops = 0;

        for (int i = 0; i < A.length; i++) {
            if (peopleInLift.size() < X && totalWeightInLift + A[i] <= Y) {
                totalWeightInLift += A[i];
                peopleInLift.add(A[i]);
                if (stops.add(B[i])) {
                    totalStops++;
                }
            } else {
                totalStops++;
                stops.clear();
                peopleInLift.clear();
                totalWeightInLift = 0;
                i--;
            }
            System.out.println("People in Lift: " + peopleInLift);
            System.out.println("Stops in Lift: " + stops);
        }
        System.out.println("Stops: " + stops);
        System.out.println("Total stops: " + (totalStops + 1));
        System.out.println("People in lift: " + peopleInLift);
        return (totalStops + 1);
    }
}
