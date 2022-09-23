
public class Envelope extends Parcel{

    public Envelope(){
        super("", new PostageCalculator());
    }

    public Envelope(PostageCalculator pc) {
        super("", pc);
    }

    public Envelope(String address, PostageCalculator pc) {
        super(address, pc);
    }
}
