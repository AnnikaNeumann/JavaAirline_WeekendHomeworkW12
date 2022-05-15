import People.Pilot;
import People.Passenger;
import People.Rank;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private Rank cabinCrewMember;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Rank cabinCrewMember, ArrayList<Passenger>, PlaneType planeType, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMember = cabinCrewMember;
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Rank getCabinCrewMember() {
        return cabinCrewMember;
    }

    public void setCabinCrewMember(Rank cabinCrewMember) {
        this.cabinCrewMember = cabinCrewMember;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
