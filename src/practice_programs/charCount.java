package practice_programs;

import java.util.HashMap;

public class charCount {
    public static void main(String[] args) {
        String s = "Aditya Sairam";
        charCount(s);
    }

    public static void charCount(String s) {

        char[] ch = s.toLowerCase().toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : ch) {
            if (c != ' ') {
                if (!hm.containsKey(c)) {
                    hm.put(c, 1);
                } else {
                    hm.put(c, hm.get(c) + 1);
                }
            }
        }
        System.out.println(hm);

    }
}