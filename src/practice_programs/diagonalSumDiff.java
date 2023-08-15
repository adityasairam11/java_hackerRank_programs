package practice_programs;

import java.util.List;

public class diagonalSumDiff {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftCross=0;
        int rightCross=0;

        for(int i=0;i<arr.size();i++){
            leftCross = leftCross+arr.get(i).get(i);
        }

        for(int i=0,j=arr.size()-1;i<arr.size();i++){
            rightCross = rightCross+arr.get(i).get(j);
            j--;
        }

        int result = Math.abs(leftCross-rightCross);


        return result;
    }

}