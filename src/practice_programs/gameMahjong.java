package practice_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class gameMahjong {

    public static void main(String[] args) {
        String tiles_1 = "88844";
        String tiles_2 = "99";
        String tiles_3 = "55555";
        String tiles_4 = "22333333";
        String tiles_5 = "73797439949499477339977777997394947947477993";
        String tiles_6 = "111333555";
        String tiles_7 = "42";
        String tiles_8 = "888";
        String tiles_9 = "100100000";
        String tiles_10 = "346664366";
        String tiles_11 = "8999998999898";
        String tiles_12 = "17610177";
        String tiles_13 = "600061166";
        String tiles_14 = "6996999";
        String tiles_15 = "03799449";
        String tiles_16 = "64444333355556";
        String tiles_17 = "7";
        System.out.println("tiles_1::" + mahjongFunction(tiles_1));
        System.out.println("tiles_2::" + mahjongFunction(tiles_2));
        System.out.println("tiles_3::" + mahjongFunction(tiles_3));
        System.out.println("tiles_4::" + mahjongFunction(tiles_4));
        System.out.println("tiles_5::" + mahjongFunction(tiles_5));
        System.out.println("tiles_6::" + mahjongFunction(tiles_6));
        System.out.println("tiles_7::" + mahjongFunction(tiles_7));
        System.out.println("tiles_8::" + mahjongFunction(tiles_8));
        System.out.println("tiles_9::" + mahjongFunction(tiles_9));
        System.out.println("tiles_10::" + mahjongFunction(tiles_10));
        System.out.println("tiles_11::" + mahjongFunction(tiles_11));
        System.out.println("tiles_12::" + mahjongFunction(tiles_12));
        System.out.println("tiles_13::" + mahjongFunction(tiles_13));
        System.out.println("tiles_14::" + mahjongFunction(tiles_14));
        System.out.println("tiles_15::" + mahjongFunction(tiles_15));
        System.out.println("tiles_16::" + mahjongFunction(tiles_16));
        System.out.println("tiles_17::" + mahjongFunction(tiles_17));
    }

    /*
You're creating a game with some amusing mini-games, and you've decided to make a simple variant of the game Mahjong.

In this variant, players have a number of tiles, each marked 0-9. The tiles can be grouped into pairs or triples of the same tile. For example, if a player has "33344466", the player's hand has a triple of 3s, a triple of 4s, and a pair of 6s. Similarly, "55555777" has a triple of 5s, a pair of 5s, and a triple of 7s.

A "complete hand" is defined as a collection of tiles where all the tiles can be grouped into any number of triples (zero or more) and exactly one pair, and each tile is used in exactly one triple or pair.

Write a function that takes a string representation of a collection of tiles in no particular order, and returns true or false depending on whether or not the collection represents a complete hand.

tiles_1 = "88844"           # True. Base case - a pair and a triple
tiles_2 = "99"              # True. Just a pair is enough.
tiles_3 = "55555"           # True. The triple and a pair can be of the same tile value
tiles_4 = "22333333"        # True. A pair and two triples
tiles_5 = "73797439949499477339977777997394947947477993"
                            # True. 4 has two triples and a pair, other numbers have just triples
tiles_6 = "111333555"       # False. There are three triples, 111 333 555 but no pair
tiles_7 = "42"              # False. Two singles not forming a pair
tiles_8 = "888"             # False. A triple, no pair
tiles_9 = "100100000"       # False. A pair of 1 and two triples of 0, a left over 0
tiles_10 = "346664366"      # False. Three pairs and a triple
tiles_11 = "8999998999898"  # False. A triple of 8, three triples of 9, a leftover 8
tiles_12 = "17610177"       # False. Triples of 1, and 7, left over 6 and 0
tiles_13 = "600061166"      # False. A pair of 1, triple of 0, triple of 6, and 6 leftover
tiles_14 = "6996999"        # False. A pair of 6, a triple of 9 and another pair of 9
tiles_15 = "03799449"       # False. A pair of 4, triple of 9 and 0, 3, and 7 left over
tiles_16 = "64444333355556" # False. A pair of 6, two pairs each of 3, 4, 5
tiles_17 = "7"              # False. No pairs and 7 leftover



complete(tiles_1) => True
complete(tiles_2) => True
complete(tiles_3) => True
complete(tiles_4) => True
complete(tiles_5) => True
complete(tiles_6) => False
complete(tiles_7) => False
complete(tiles_8) => False
complete(tiles_9) => False
complete(tiles_10) => False
complete(tiles_11) => False
complete(tiles_12) => False
complete(tiles_13) => False
complete(tiles_14) => False
complete(tiles_15) => False
complete(tiles_16) => False
complete(tiles_17) => False

Complexity Variable
N - Number of tiles in the input string
*/
    public static boolean mahjongFunction(String input) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            int a = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (!hm.containsKey(a)) {
                hm.put(a, count);
            } else {
                hm.put(a, hm.get(a) + 1);
            }
        }

        ArrayList<Integer> al = new ArrayList();
        al.addAll(hm.values());
        Collections.sort(al);
        boolean a = false;
        boolean b = false;
        boolean c = false;
        int twoCount = 0;


        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) != 1) {
                if ((al.get(i)) == 2) {
                    twoCount++;
                    a = true;
                } else if ((al.get(i)) % 3 == 0) {
                    b = true;
                } else if ((al.get(i)) % 3 == 2) {
                    c = true;
                    b = true;
                    twoCount++;
                } else if ((al.get(i)) % 3 != 1) {
                    b = true;
                } else if (al.get(i) % 3 == 1) {
                    a = false;
                    b = false;
                    c = false;
                }
            } else {
                return b;
            }
        }
        if (a && twoCount == 1 || b && c && twoCount == 1) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }
}