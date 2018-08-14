package data;

import data.Competiror;

public class Score implements Comparable<Score>{
    private Competiror competitor;
    private int points;

    public Score(String firstName, String lastName, int points) {
        this.competitor = new Competiror(firstName, lastName);
        this.points = points;
    }

    public Competiror getCompetitor() {
        return competitor;
    }

    public void setCompetitor(Competiror competitor) {
        this.competitor = competitor;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return competitor + " " + points + " pkt.";
    }

    @Override
    public int compareTo(Score s) {
        return this.getCompetitor().compareTo(s.getCompetitor());
    }
}
