import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Hitachi", "BZ4");
    }

    @Test
    public void canGetMake(){
        assertEquals("Hitachi", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("BZ4", cdPlayer.getModel());
    }

    @Test
    public void canPlayCD(){
        assertEquals("Now playing Abba", cdPlayer.play("Abba"));
    }

}
