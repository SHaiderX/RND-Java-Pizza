public abstract class Parcel {

    private String address;
    private PostageCalculator pc;

    public Parcel(String address, PostageCalculator pc) {
        this.address = address;
        this.pc = pc;
    }

    public String getAddress() {
        return address;
    }

    public Parcel getParcel(String parcelType, String can) {
        PostageCalculator pc;
        if (can.equals("Canada"))
            pc = new CanadianPostageCalulator();
        else
            pc = new AmericanPostageCalculator();

        switch (parcelType) {
            case "Box":
                return new Box(pc);
            case "Envelope":
                return new Envelope(pc);
            default:
                return new Envelope(pc);
        }

    }
}