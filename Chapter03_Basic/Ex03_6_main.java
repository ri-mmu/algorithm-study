package Chapter03_Basic;

import java.util.*;

public class Ex03_6_main {
    public static void main(String[] arg) {
        ArrayList<Score> myarr = new ArrayList<>();
        myarr.add(new Score(80, 100));
        myarr.add(new Score(100, 50));
        myarr.add(new Score(70, 100));
        myarr.add(new Score(80, 90));

//        Collections.sort(myarr);
        Collections.sort(myarr, new ScoreComparator());
        for (Score s : myarr) {
            System.out.println(s.toString());
        }
    }
}
