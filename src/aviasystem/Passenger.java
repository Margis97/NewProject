package aviasystem;

public class Passenger {
	String name;
	String secondName;
	String place;
    String typeClass;
    String flightNumber;
    
    public Passenger(String name, String secondName, String place, String typeClass, String flightNumber) {
		this.name = name;
		this.secondName = secondName;
		this.place = place;
		this.typeClass = typeClass;
		this.flightNumber = flightNumber;
	}

	public void printInfo() {
    	System.out.println(name + " " + secondName + " " + place + " " + typeClass);
    }
}
