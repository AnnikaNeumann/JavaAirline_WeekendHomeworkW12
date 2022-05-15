package People;

public class CabinCrewMember extends Person{

    private String rank;

    public CabinCrewMember(String rank, String name){
        super(name);
        this.rank = rank;
    }

    public String getRank(String rank){
        return rank;
    }

    public String canSpeakToPassengers(){
        return "In the event of a sudden loss of cabin pressure, oxygen masks will descend from the ceiling. Stop screaming, grab the mask, and pull it over your face."
    }
}
