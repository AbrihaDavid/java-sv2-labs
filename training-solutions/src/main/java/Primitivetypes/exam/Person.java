package Primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private int zipCode;
    private  double avgOfScores;

    public Person(String name, LocalDate dateOfBirth, int zipCode, double avgOfScores) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipCode = zipCode;
        this.avgOfScores = avgOfScores;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAvgOfScores() {
        return avgOfScores;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"+
                "Date of birth: " + dateOfBirth + "\n"+
                "Zip code: " + zipCode + "\n"+
                "Average of scores: " + avgOfScores;
    }
}
