package data;

import java.util.Comparator;

public class PointsComparator implements Comparator<Score> {


    @Override
    public int compare(Score s1, Score s2) {

        return Integer.compare(s1.getPoints(), s2.getPoints());
    }
}
