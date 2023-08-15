package practice_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class juliusceaser {
    public static String caesarCipher(String s, int k) {
        String result = "";
        String regex = "[a-z]+";
        String capsRegex = "[A-Z]+";
        Pattern p;
        Matcher m;
        int z = 0;
        if(k>26){
            k=k%26;
        }
        for (char c : s.toCharArray()) {
            String a = Character.toString(c);
            p = Pattern.compile(regex);
            m = p.matcher(a);
            if (m.matches()) {
                c = (char) (c + k);
                z = (int) (c);
                if (z > 122) {
                    c = (char) (c - 26);
                }
            }
            p = Pattern.compile(capsRegex);
            m = p.matcher(a);
            if (m.matches()) {
                c = (char) (c + k);
                z = (int) (c);
                if (z > 90) {
                    c = (char) (c - 26);
                }
            }
            result = result + c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U", 62));
    }

}

//hacker rank link - https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true