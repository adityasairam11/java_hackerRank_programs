package practice_programs;

import java.util.*;

public class migratoryBirds {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(4);

        System.out.println(migratoryBirds(arr));

    }
    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        int count = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (!hm.containsKey(arr.get(i))) {
                hm.put(arr.get(i), count);
            } else {
                hm.put(arr.get(i), hm.get(arr.get(i)) + 1);
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        al.addAll(hm.values());
        Collections.sort(al, Collections.reverseOrder());
        int maxValue = al.get(0);
        hm.get(maxValue);
        int result = 0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == maxValue) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}