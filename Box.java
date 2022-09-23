public class Box extends Parcel{

    public Box(){
        super("", new PostageCalculator());
    }

    public Box (PostageCalculator pc) {
        super("", pc);
    }

    public Box (String address, PostageCalculator pc) {
        super(address, pc);
    }
}
