package practice_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class lonleyinteger {
    public static int lonelyinteger(List<Integer> a) {
        int i=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int j: a){
            int count=1;
            if(!hm.containsKey(j)){
                hm.put(j,count);
            }
            else{
                count=2;
                hm.put(j,count);
            }
        }
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(1)) {
                i = (int) o;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);a.add(1);a.add(2);a.add(2);a.add(3);
        System.out.println(lonelyinteger(a));
    }
}

//hacker rank link - https://www.hackerrank.com/challenges/lonely-integer/problem?isFullScreen=true