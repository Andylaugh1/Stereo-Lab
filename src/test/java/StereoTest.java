import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    Radio radio;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "B28");
        recordDeck = new RecordDeck("Hitachi", "BZ4");
        radio = new Radio();
        stereo = new Stereo(cdPlayer, recordDeck, radio, 5);
    }

    @Test
    public void canGetCDPlayer(){
        assertEquals(cdPlayer, stereo.getCDPlayer());
    }

    @Test
    public void canGetRecordDeck(){
        assertEquals(recordDeck, stereo.getRecordDeck());
    }

    @Test
    public void canGetRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Tuned to Radio 1", stereo.tuneRadio("Radio 1"));
    }

    @Test
    public void canPlayCD(){
        assertEquals("Now playing Abba", stereo.playCD("Abba"));
    }

    @Test
    public void canGetVolume(){
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void canRaiseVolume(){
        stereo.raiseVolume(3);
        assertEquals(8, stereo.getVolume());
    }

    @Test
    public void canLowerVolume(){
        stereo.raiseVolume(3);
        stereo.lowerVolume(3);
        assertEquals(5, stereo.getVolume());
    }


}
