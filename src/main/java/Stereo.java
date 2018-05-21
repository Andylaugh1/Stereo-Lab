public class Stereo {

    private CDPlayer cdPlayer;
    private RecordDeck recordDeck;
    private Radio radio;
    private int volume;

    public Stereo(CDPlayer cdPlayer, RecordDeck recordDeck, Radio radio, int volume){
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.radio = radio;
        this.volume = volume;

    }

    public CDPlayer getCDPlayer() {
        return this.cdPlayer;
    }

    public RecordDeck getRecordDeck() {
        return this.recordDeck;
    }

    public Radio getRadio(){
        return this.radio;
    }


    public String tuneRadio(String station) {
        return this.radio.tune(station);
    }

    public String playCD(String cd){
        return this.cdPlayer.play(cd);
    }

    public int getVolume() {
        return this.volume;
    }

    public void raiseVolume(int raise){
        this.volume += raise;
    }

    public void lowerVolume(int lower){
        this.volume -= lower;
    }
}
