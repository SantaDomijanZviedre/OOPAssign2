package com.company;

public class Officer {

    private String name;
    private String surname;
    public int officerID;
    private int crimesSolved;
    private String workingInDistrict;

    public Officer() {
    }

    public Officer(String name, String surname, int officerID,
                   int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public String toString() {
        return "{" + name + ", " + surname + ", " + officerID + ", " + crimesSolved + '}';
    }

    public int calculatedLevel(int crimesSolved) {

        if (this.crimesSolved < 20)
            return 1;
        if (this.crimesSolved < 40)
            return 2;
        return 3;
    }
}
