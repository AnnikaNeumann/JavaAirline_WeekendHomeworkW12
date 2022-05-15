package People;

public class Pilot extends CabinCrewMember {

    private String rank;
    private String licenceNumber;

    public Pilot(String name, String rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String canFlyPlane(){
        return "Engage";
    }

    public String getLicenceNumber(){
        return licenceNumber;
    }


}

