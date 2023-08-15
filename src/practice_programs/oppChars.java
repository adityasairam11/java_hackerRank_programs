package practice_programs;

public class oppChars {
    public static String reverseChars(String s) {
        char[] input = s.toCharArray();
        String opResult = "";
        final int CAP_Z = 'Z';
        final int CAP_A = 'A';
        final int small_z = 'z';
        final int small_a = 'A';
        //capital series - 65 to 90 //small series 97 to 123
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            char c = input[i];
            if (Character.isLowerCase(c)) {
                j = small_z - c + small_a;
            } else {
                j = CAP_Z - c + CAP_A;
            }
            c = ((char) j);
            opResult = opResult + c;

        }
        return opResult;
    }

    public static void main(String[] args) {
        System.out.println(reverseChars("abc"));
    }
}