
package airport;

import airport.model.Plane;
import airport.service.AirportService;

public class AirportTest {
    public static void main(String[] args) {

        AirportService airportService = new AirportService();
        Plane plane = airportService.creatPlane();
        Plane plane2 = airportService.creatPlane();
        Plane plane3 = airportService.creatPlane();
//        Plane[] planesWithoutVarargs = {plane, plane2, plane3};

//        airportService.printNameAndReleaseDate(plane);

//        airportService.printNameOrHours(plane);

//        String result = airportService.nameOfPlaneWithBiggerTime(plane, plane2);
//        System.out.println(result);

//        airportService.planeWithBiggerName(plane, plane2).printAllInfo();

//        airportService.printPlaneArray(plane, plane2, plane3);

//        airportService.printMilitaryPlanesAfter2010(plane, plane2, plane3);

//        airportService.maxHoursInAir(plane, plane2, plane3).printAllInfo();

//        airportService.printOldestPlane(plane, plane, plane3);

//        airportService.printNewestPlaneWhichIsMilitary(plane, plane2, plane3);

        airportService.sortByReleaseYear(plane, plane2, plane3);
    }
}
