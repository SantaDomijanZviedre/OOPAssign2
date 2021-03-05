package com.company;

import java.sql.SQLOutput;
import java.time.Year;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Officer officer1 = new Officer("Ivo", "Domijan", 1011, 5);
        Officer officer2 = new Officer("Linda", "Domijan", 1012, 6);
        Officer officer3 = new Officer("Vigo", "Domijan", 1013, 7);
        Officer officer4 = new Officer("John", "Smith", 1015, 5);
        Officer officer5 = new Officer("Jim", "Smith2", 1016, 2);
        Officer officer6 = new Officer("Jane", "Smith3", 1017, 6);
        Officer officer7 = new Officer("June", "Smith4", 1018, 5);

        District district1 = new District("A", "Riga", 1, new Officer[0]);
        District district2 = new District("B", "Tukums", 2, new Officer[0]);

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        System.out.println("Status District A : " + district1 + "\nStatus District B: " + district2);

        district2.removeOfficer(officer4);
        System.out.println("New status District B: " + district2);

        System.out.println("Average Officers level in District A: " + district1.calculateAvgLevelInDistrict());
        System.out.println("Average Officers level in District B: " + district2.calculateAvgLevelInDistrict());

        ArrayList<District> districtArray = new ArrayList<>();
        districtArray.add(district1);
        districtArray.add(district2);

        System.out.println("There are together " + numberOfOfficers(districtArray) + " officers in both districts.");

        System.out.println("The average level of District A is: " + district1.calculateAvgLevelInDistrict());
        System.out.println("The average level of District B is: " + district2.calculateAvgLevelInDistrict());
        System.out.println("The average level of both Districts is: " +
                (district1.calculateAvgLevelInDistrict() + district2.calculateAvgLevelInDistrict()) / 2);

        whichDistrictBetter(districtArray);
    }


    public static int numberOfOfficers(ArrayList<District> districtArray) {
        int numberOfOfficers = 0;
        for (District district : districtArray) {
            numberOfOfficers = numberOfOfficers + district.getOfficersInTheDistrict().length;
        }
        return numberOfOfficers;
    }

    public static void whichDistrictBetter(ArrayList<District> districtArray) {

        for (int i = 0, j = i + 1; i < districtArray.size(); i++) {
            if (districtArray.get(i).calculateAvgLevelInDistrict() ==
                    districtArray.get(j).calculateAvgLevelInDistrict()) {
                System.out.println("Both district are equally good");
            } else
                if (districtArray.get(i).calculateAvgLevelInDistrict() >
                    districtArray.get(j).calculateAvgLevelInDistrict()) {
                System.out.println("Best district is: " + districtArray.get(i).getTitle());
            } else
                System.out.println("Best district is: " + districtArray.get(j).getTitle());
        }
    }

//    public static int whichIsBetter(ArrayList<District> districtArray) {
//        if (calculateAvgLevelInDistrict == district2.calculateAvgLevelInDistrict()) {
//            System.out.println("Both districts are equally good.");
//        } else if {
//            (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict())
//            System.out.println("District A is better.");
//        } else {
//            System.out.println("District B is better");
//        }
//    }

//
//
//        officers = new ArrayList<>();
//
//        districts.add(new District("Sea", "Jurmala", 2, officers));
//
//        districts.get(0).addNewOfficer(new Officer(""));
//
//
//       /* ArrayList<Officer> DistrictA = new ArrayList<Officer>();
//        DistrictA.add(one);
//        DistrictA.add(two);
//        DistrictA.add(three);
//        System.out.println(DistrictA);
//        for (Officer value : DistrictA) {
//            System.out.println(value);
//        }
//
//        ArrayList<Officer> DistrictB = new ArrayList<Officer>();
//        DistrictB.add(four);
//        DistrictB.add(five);
//        DistrictB.add(six);
//        DistrictB.add(seven);
//        System.out.println(DistrictB);
//        for (Officer value : DistrictB) {
//            System.out.println(value);
//        }
//
//        A.addNewOfficer(one);
//        A.addNewOfficer(two);
//        A.addNewOfficer(three);
//        B.addNewOfficer(four);
//        B.addNewOfficer(five);
//        B.addNewOfficer(six);
//        B.addNewOfficer(seven);
//        B.removeOfficer(two);
//        break;
//    }*/
//
//
//        System.out.println("New officer(s) in the database: " + officers);
//        //officers.stream().count();
//
//
//       /* A.addNewOfficer(officers.get(0));
//        A.addNewOfficer(officers.get(1));
//        A.addNewOfficer(officers.get(2));
//        B.addNewOfficer(officers.get(3));
//        B.addNewOfficer(officers.get(4));
//        B.addNewOfficer(officers.get(5));
//        B.addNewOfficer(officers.get(6));
//*/
//        // B.removeOfficer(officers.get(1));
//
//        System.out.println("There are the following Officers in the database: " + officers.toString());
//        System.out.println((A.toString()));
//        System.out.println(B.toString());

}