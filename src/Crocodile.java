
public class Crocodile extends Reptile {
    private boolean didGotDentalCare;

    public Crocodile(boolean didGotDentalCare, double tailLength) {
        super(tailLength, true, (int) ((Math.random() * 1500) + 1500));
        this.didGotDentalCare = didGotDentalCare;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCrocodile: " +
                "\n     Did got dental care: " + didGotDentalCare ;
    }

    public boolean isDidGotDentalCare() {
        return didGotDentalCare;
    }

    public void setDidGotDentalCare(boolean didGotDentalCare) {
        this.didGotDentalCare = didGotDentalCare;
    }

    public int eat(){
        return super.eat()*2;
    }
}
