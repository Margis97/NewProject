package aviasystem;

import java.util.ArrayList;
import java.util.List;

public class Plane {
	String flightNumber;
	String startTime;
    String pointOfarrival;
    List<Passenger> passengerList;
    
	public Plane(String flightNumber, String startTime, String pointOfarrival) {
		this.flightNumber = flightNumber;
		this.startTime = startTime;
		this.pointOfarrival = pointOfarrival;
		this.passengerList = new ArrayList<>();
	}
	
	public void addPassenger(String name, String secondName, String place, String typeClass, String flightNumber) {
		Passenger passenger = new Passenger(name, secondName, place, typeClass, flightNumber);
		passengerList.add(passenger);	
	}
	
	
	public void printList(String flightNumber) {
		for (int i = 0; i < passengerList.size(); i++) {
			Passenger passenger = passengerList.get(i);
			if (passenger.flightNumber == flightNumber) {
				passenger.printInfo();
			}
		}
	}   
     
	public static void main(String[] args) {
		Plane plane = new Plane("SU119", "09:00", "Moscow");
		plane.addPassenger("Ivan", "Petrov", "31A", "Economy", "SU119");	
		plane.printList("SU119");
		
		Plane plane1 = new Plane("DP466", "10:00", "Samara");
		plane1.addPassenger("Maria", "Shpak", "1A", "Business", "DP466");
		plane1.printList("DP466");
	}
}
