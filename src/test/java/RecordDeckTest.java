import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Sony", "B28");
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("B28", recordDeck.getModel());
    }
}
