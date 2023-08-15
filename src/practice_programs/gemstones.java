package practice_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class gemstones {

    public static int gemstones(List<String> arr) {
        // Write your code here
        int gemCount = 0;
        List<List<String>> lists = new ArrayList<List<String>>();

        for (int i = 0; i < arr.size(); i++) {
            List<String> list = new ArrayList<>();
            for (char c : arr.get(i).toCharArray()) {
                list.add(Character.toString(c));
            }
            lists.add(list);
        }
        List<String> finallist = new ArrayList<>(lists.get(0));
        for (int j = 1; j < lists.size(); j++) {
            finallist.retainAll(lists.get(j));
        }
        Set<String> set = new HashSet<>(finallist);

        gemCount = set.size();
        return gemCount;
    }

    public static void reverse(List<Integer> arr) {
        String result = "";
        for (int i = arr.size() - 1; i >= 0; i--) {
            result = Integer.toString(arr.get(i))+" ";
            System.out.print(result);
        }
    }

    public static void main(String[] args) {
        List<Integer> reqllist = new ArrayList<>();
        reqllist.add(12);
        reqllist.add(34);
        reqllist.add(566);
//        reqllist.add("dyinmxhpcecfalcqvciehekkhkzxxkhabqowpbnroztcacrqzxpjcj");
//        reqllist.add("ceaunnagbqbwyod");
        reverse(reqllist);
    }
}
