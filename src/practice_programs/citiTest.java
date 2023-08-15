package practice_programs;

import java.util.Arrays;

public class citiTest {

    public static void main(String args[]) {
        int[] intArray = {-1, 1, 2, 3, 4, 8};
        Arrays.sort(intArray);
        int ans = 1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == ans) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
