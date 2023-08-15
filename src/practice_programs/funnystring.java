package practice_programs;

import java.util.ArrayList;

public class funnystring {

    public static String funnyString(String s) {

        String result = "Not Funny";
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al3 = new ArrayList<>();
        ArrayList<Integer> al4 = new ArrayList<>();

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        for (char c : s.toCharArray()) {
            al1.add((int) (c));
        }
        for (char c : reverse.toCharArray()) {
            al2.add((int) (c));
        }
        for (int i = 0; i < al1.size(); i++) {
            int a, b;
            if (i < al1.size() - 1) {
                a = al1.get(i);
                b = al1.get(i + 1);
                al3.add(Math.abs(a - b));
            }
        }
        for (int j = 0; j < al2.size(); j++) {
            int c, d;
            if (j < al2.size() - 1) {
                c = al2.get(j);
                d = al2.get(j + 1);
                al4.add(Math.abs(c - d));
            }
            if (al3.equals(al4)) {
                result = "Funny";
            }

        }

        return result;

    }


    public static void main(String[] args) {
        System.out.println(funnyString("acxz"));
    }
}