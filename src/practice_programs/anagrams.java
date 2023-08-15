package practice_programs;

import java.util.HashMap;

public class anagrams {
    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
        int count = 0;
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        int j = 0;
        for (char c : s1.toCharArray()) {
            hm.put(Character.toString(c), j);
            j++;
        }
        int k = 0;
        for (char c : s2.toCharArray()) {
            hm1.put(Character.toString(c), k);
            k++;
        }
        hm2.putAll(hm);
        hm2.putAll(hm1);
        count = hm2.size();
        int count1 = s1.length() + s2.length();
        count = count1 - count;
        StringBuffer ss1= new StringBuffer(s1);
        StringBuffer ss2= new StringBuffer(s2);
        int ss1count=0;
        while(ss1.length()!=count){
            ss1.deleteCharAt(ss1count);
            ss1count++;
        }
        int ss2count=0;
        while(ss2.length()!=count){
            ss2.deleteCharAt(ss2count);
            ss2count++;
        }

        count = ss1count+ss2count;

        return count;

    }
    public static void main(String[] args) {
        System.out.println(makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj","djfladfhiawasdkjvalskufhafablsdkashlahdfa"));
    }
}
