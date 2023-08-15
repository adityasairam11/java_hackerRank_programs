package practice_programs;

import java.util.ArrayList;

public class binaryString {

    public static int beautifulBinaryString(String b) {
        String a = "";
        int count = 0;


        ArrayList<Integer> ba = new ArrayList<>();

        for (char c : b.toCharArray()) {
            ba.add((int)c-48);
        }

        for (int j = 0; j < b.length() - 2; j++) {
            a = Integer.toString(ba.get(j)).concat(Integer.toString(ba.get(j+1)).concat(Integer.toString(ba.get(j+2))));
            if (a.equals("010")) {
                count++;
                j=j+2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0100101010100010110100100110110100011100111110101001011001110111110000101011011111011001111100011101"));

    }
}
