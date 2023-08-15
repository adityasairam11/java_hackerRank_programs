package practice_programs;

public class leapYear {
    public static String dayOfProgrammer(int year) {

        String resultDate = "13.09." + year;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            resultDate = "12.09." + year;
        }

        return resultDate;
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2016));
    }

}
