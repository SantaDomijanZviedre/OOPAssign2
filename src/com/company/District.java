package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class District {

    private String title;
    private String city;
    private int districtID;
    private Officer[] officersInTheDistrict;


    public District() {
    }

    public District(String title, String city, int districtID, Officer[] officersInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.officersInTheDistrict = officersInTheDistrict;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public Officer[] getOfficersInTheDistrict() {
        return officersInTheDistrict;
    }

    public void setOfficersInTheDistrict(Officer[] officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;
    }

    public String toString(){
        return "District {" + title + ", " + city + ", " + districtID + ", " +
                Arrays.toString(officersInTheDistrict) + '}';
    }

    public boolean addNewOfficer(Officer officer) {
        ArrayList<Officer> officerList = new ArrayList<>(Arrays.asList(getOfficersInTheDistrict()));
        officerList.add(officer);
        setOfficersInTheDistrict(officerList.toArray(new Officer[0]));
        return true;
    }

    public boolean removeOfficer(Officer officer) {
        ArrayList<Officer> officerList = new ArrayList<>(Arrays.asList(getOfficersInTheDistrict()));
        officerList.remove(officer);
        setOfficersInTheDistrict(officerList.toArray(new Officer[0]));
        return true;
    }

    public float calculateAvgLevelInDistrict() {
        Officer[] officersArray = getOfficersInTheDistrict();
        float sumOfficerLevel = 0;
        for (Officer officer : officersArray) {
            sumOfficerLevel += officer.calculatedLevel(officer.getCrimesSolved());
        }
        return sumOfficerLevel / officersArray.length;
    }
}
