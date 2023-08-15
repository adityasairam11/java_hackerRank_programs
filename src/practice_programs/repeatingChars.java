package practice_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class repeatingChars {

    public static void main(String[] args){
        String s = "Adityai";
        repeatingCharCount(s);
    }

    public static void repeatingCharCount(String strInput){

        HashSet<Character> hs = new LinkedHashSet();
        char[] repeatingChars = new char[strInput.length()];
        char[] ch= strInput.toLowerCase().toCharArray();
        for(int i=0;i<strInput.length();i++){

            if(hs.add(ch[i])==false){
                repeatingChars[i]=ch[i];
            }
            hs.add(ch[i]);
        }
        System.out.println(hs);
        System.out.println("repeating chars::"+ Arrays.toString(repeatingChars));
    }
}