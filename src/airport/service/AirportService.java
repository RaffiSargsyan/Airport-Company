package airport.service;


import airport.model.Plane;

import java.util.Scanner;

public class AirportService {

    public Plane creatPlane() {
        Scanner scanner = new Scanner(System.in);
        Plane newPlane = new Plane();

        System.out.println("Please input name of the plane");
        newPlane.setName(scanner.nextLine());
        System.out.println("Please input the hours in the air");
        newPlane.setHoursInAir(Integer.parseInt(scanner.nextLine()));
        System.out.println("Please input release year");
        newPlane.setReleaseYear(Integer.parseInt(scanner.nextLine()));
        System.out.println("Please answer:Is it a military plane? Yes/No");
        newPlane.setMilitary(scanner.nextLine().toLowerCase().charAt(0) == 'y');
        return newPlane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + ", " + plane.getReleaseYear());
    }

    public void printNameOrHours(Plane plane) {
//        if (plane.getReleaseYear() > 2000) {
//            System.out.println(plane.getName());
//        } else {
//            System.out.println(plane.getHoursInAir());
//        }
        System.out.println(plane.getReleaseYear() > 2000 ? plane.getName() : plane.getHoursInAir());
    }

    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {
//        if (plane1.getHoursInAir() > plane2.getHoursInAir()) {
//            return plane1.getName();
//        } else {
//            return plane2.getName();
//        }
        return plane1.getHoursInAir() > plane2.getHoursInAir() ? plane1.getName() : plane2.getName();
    }

    public Plane planeWithBiggerName(Plane planeOne, Plane planeTwo) {
//        if (planeOne.getName().length() > planeTwo.getName().length()) {
//            return planeOne;
//        } else {
//            return planeTwo;
//        }
        return planeOne.getName().length() > planeTwo.getName().length() ? planeOne : planeTwo;
    }

    public void printPlaneArray(Plane... planes) {
        for (Plane plane : planes) {
            plane.printAllInfo();
        }
    }

    public void printMilitaryPlanesAfter2010(Plane... planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getReleaseYear() > 2010) {
                plane.printAllInfo();
            }
        }

    }

    public Plane maxHoursInAir(Plane... planes) {
        Plane maxHoursInAir = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getHoursInAir() > maxHoursInAir.getHoursInAir()) {
                maxHoursInAir = planes[i];
            }
        }
        return maxHoursInAir;
    }

    public void printOldestPlane(Plane... planes) {
        Plane minReleaseYear = planes[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getReleaseYear() < minReleaseYear.getReleaseYear()) {
            }
        }
        minReleaseYear.printAllInfo();
    }

    public void printNewestPlaneWhichIsMilitary(Plane... planes) {
        Plane max = planes[0];//{n 20}
        int indexOfMilitary = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                max = planes[i];
                indexOfMilitary = i;
                break;
            }
        }
        for (int i = indexOfMilitary + 1; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getHoursInAir() > max.getReleaseYear()) {
                max = planes[i];
            }
        }
        max.printAllInfo();
    }

    public void sortByReleaseYear(Plane... planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[j].getReleaseYear() >
                        planes[j - 1].getReleaseYear()) {
                    Plane temp = planes[j];
                    planes[j] = planes[j - 1];
                    planes[j - 1] = temp;
                }
            }
        }
        printPlaneArray(planes);
    }
}
