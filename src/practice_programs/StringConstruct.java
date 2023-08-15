package practice_programs;

public class StringConstruct {

    public static int stringConstruction(String s) {

        int count = 1;
        String p = "";
        p = p + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            String a = "";
            a = a + s.charAt(i);
            if (!p.contains(a)) {
                count++;
                p = p + s.charAt(i);
            }

        }
        //count=p.length();

        return count;
    }

    public static void main(String[] args) {
        System.out.println(stringConstruction("abcd"));
    }

}