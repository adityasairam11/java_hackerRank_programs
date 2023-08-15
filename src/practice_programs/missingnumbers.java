package practice_programs;

import java.util.*;

public class missingnumbers {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> resultList = new ArrayList<>();
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        HashMap<Integer, Integer> hn = new LinkedHashMap<>();
        Collections.sort(arr);
        Collections.sort(brr);

        for (int j : arr) {
            int count = 1;
            if (!hm.containsKey(j)) {
                hm.put(j, count);
            } else {
                count = hm.get(j) + 1;
                hm.put(j, count);
            }
        }

        for (int j : brr) {
            int count = 1;
            if (!hn.containsKey(j)) {
                hn.put(j, count);
            } else {
                count = hn.get(j) + 1;
                hn.put(j, count);
            }
        }


        for (int element : hn.keySet()) {
            if (hm.containsKey(element)) {
                if (hn.get(element) > hm.get(element)) {
                    resultList.add(element);
                }} else {
                    resultList.add(element);
                }
            }


        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(7);
        l1.add(2);
        l1.add(5);
        l1.add(3);
        l1.add(5);
        l1.add(3);
        l2.add(7);
        l2.add(2);
        l2.add(5);
        l2.add(3);
        l2.add(5);
        l2.add(3);
        l2.add(4);
        l2.add(6);
        System.out.println(missingNumbers(l1, l2));

    }
}


//hackerrank link - https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true