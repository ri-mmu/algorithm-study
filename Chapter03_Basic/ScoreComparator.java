package Chapter03_Basic;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Score> {
    @Override
    public int compare(Score o1, Score o2) {
        if (o1.math == o2.math) return o2.english - o1.english;
        return o2.math - o1.math;
    }
}
