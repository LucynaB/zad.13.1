package data;

public class Competiror implements Comparable<Competiror> {
    private String firstName;
    private String lastName;

    public Competiror(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " ";
    }


    @Override
    public int compareTo(Competiror c) {
        if(this.getLastName().compareTo(c.getLastName())>0){
            return 1;
        }else if(this.getLastName().compareTo(c.getLastName())<0){
            return -1;
        }
        return this.getFirstName().compareTo(c.getFirstName());

        }


}
