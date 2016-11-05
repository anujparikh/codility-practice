package codelity;

/**
 * Created by anujparikh on 11/4/16.
 */
public class Task3A {
    public int solution(String S) {
        int i = 0;
        int j = S.length() - 1;
        while (i <= j) {
            if (S.charAt(i) == '(' && S.charAt(j) == ')') {
                i++;
                j--;
            } else {
                if (S.charAt(i) != '(') i++;
                if (S.charAt(j) != ')') j--;
            }
        }
        return i;
    }
}
