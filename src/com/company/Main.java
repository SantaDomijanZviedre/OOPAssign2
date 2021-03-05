package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Officer officer1 = new Officer("Ivo", "Domijan", 1011, 123);
        Officer officer2 = new Officer("Linda", "Domijan", 1012, 6);
        Officer officer3 = new Officer("Vigo", "Domijan", 1013, 7);
        Officer officer4 = new Officer("John", "Smith", 1015, 5);
        Officer officer5 = new Officer("Jim", "Smith2", 1016, 2);
        Officer officer6 = new Officer("Jane", "Smith3", 1017, 6);
        Officer officer7 = new Officer("June", "Smith4", 1018, 5);
        Officer officer8= new Officer("Ieva", "Zviedre", 1019, 28);

        District district1 = new District("A", "Riga", 1, new Officer[0]);
        District district2 = new District("B", "Tukums", 2, new Officer[0]);
        District district3 = new District("C", "Engure", 3, new Officer[0]);

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        district3.addNewOfficer(officer8);

        System.out.println("Status District A : " + district1 + "\nStatus District B: " + district2);

        district2.removeOfficer(officer4);
        System.out.println("New status District B: " + district2);

        System.out.println("Average Officers level in District A: " + district1.calculateAvgLevelInDistrict());
        System.out.println("Average Officers level in District B: " + district2.calculateAvgLevelInDistrict());

        ArrayList<District> districtArray = new ArrayList<>();
        districtArray.add(district1);
        districtArray.add(district2);
        districtArray.add(district3);

        System.out.println("There are together " + numberOfOfficers(districtArray) + " officers in both districts.");

        System.out.println("The average level of District A is: " + district1.calculateAvgLevelInDistrict());
        System.out.println("The average level of District B is: " + district2.calculateAvgLevelInDistrict());
        System.out.println("The average level of all Districts is: " +
                districtArray.stream().collect(Collectors.averagingDouble(District::calculateAvgLevelInDistrict)));
//                (district1.calculateAvgLevelInDistrict() + district2.calculateAvgLevelInDistrict() +
//                        district3.calculateAvgLevelInDistrict()) / districtArray.size());

        System.out.println("This is the best District: " + whichDistrictBetter(districtArray).stream().
                map(District::getTitle).collect(Collectors.joining(", ")));;
    }

    public static int numberOfOfficers(ArrayList<District> districtArray) {
        int numberOfOfficers = 0;
        for (District district : districtArray) {
            numberOfOfficers = numberOfOfficers + district.getOfficersInTheDistrict().length;
        }
        return numberOfOfficers;
    }

    public static ArrayList<District> whichDistrictBetter(ArrayList<District> districtArray) {
        ArrayList<District> bestDistricts = new ArrayList<>(2);
        bestDistricts.add(districtArray.get(0));
        for (int i = 1; i < districtArray.size(); i++) {
            District currentDistrict = districtArray.get(i);
            if (currentDistrict.calculateAvgLevelInDistrict() ==
                    bestDistricts.get(0).calculateAvgLevelInDistrict()) {
                bestDistricts.add(currentDistrict);
            } else if (currentDistrict.calculateAvgLevelInDistrict() >
                    bestDistricts.get(0).calculateAvgLevelInDistrict()) {
                bestDistricts.clear();
                bestDistricts.add(currentDistrict);
            }
        }
        return bestDistricts;
    }
}