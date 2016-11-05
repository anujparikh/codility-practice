package codelity;

public class Task3 {

    public boolean checkAscOrderOfArrayWithOneSwap(int[] a) {
        boolean swapNeeded = false;
        int swapIndex1 = 0;
        int swapIndex2 = a.length - 1;
        for (int i = 0; i < a.length - 2; i++) {
            if (!(a[i] <= a[i + 1])) {
                int min = Integer.MAX_VALUE;
                swapNeeded = true;
                if (a[i] == a[i - 1]) {
                    swapIndex1 = i - 1;
                } else {
                    swapIndex1 = i;
                }
                for (int j = i + 1; j <= a.length - 2; j++, i++) {
                    if (min > a[j]) {
                        min = a[j];
                        if (j + 1 < a.length && a[j] == a[j + 1]) {
                            swapIndex2 = j + 1;
                        } else {
                            swapIndex2 = j;
                        }
                    }
                }
            }
        }
        if (swapNeeded) {
            int[] b = swap(a, swapIndex1, swapIndex2);
            for (int i = 0; i <= b.length - 2; i++) {
                if (!(b[i] <= b[i + 1])) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[] swap(int[] inputArray, int index1, int index2) {
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
        return inputArray;
    }
}
