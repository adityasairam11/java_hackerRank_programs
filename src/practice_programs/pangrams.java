package practice_programs;

import java.util.HashMap;

public class pangrams {
    public static String pangrams(String s) {
        // Write your code here
        String result = "";
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int i = 0;
        for (char c : ch) {
            hm.put(c, i);
            i++;
        }
        i = 0;
        s=s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                hm1.put(c, i);
            }
            i++;
        }
        if (hm.size() == hm1.size()) {
            result = "pangram";
        } else {
            result = "not pangram";
        }
        return result;
    }
    public static void main(String[] args) {
        /*int i = 3;
        char c= (char) ('a'+i);
        System.out.println(c);*/

        String s="the quick brown fox jumps over the lazy dog";
        System.out.println(pangrams(s));

    }
}

