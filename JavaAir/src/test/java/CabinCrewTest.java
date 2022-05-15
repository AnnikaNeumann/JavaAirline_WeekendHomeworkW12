import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    Rank cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new Rank(Rank.CABINCREWMEMBER1);

    }
    @Test
    public void setCabinCrewMember(){
        assertEquals("Jean Luc Picard", cabinCrewMember.getValueFromEnum());
    }

}

