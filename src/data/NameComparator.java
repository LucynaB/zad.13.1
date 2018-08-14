package data;

import java.util.Comparator;

public class NameComparator implements Comparator<Score> {
    @Override
    public int compare(Score s1, Score s2) {
        return s1.getCompetitor().getFirstName().compareTo(s2.getCompetitor().getFirstName());
    }
}
