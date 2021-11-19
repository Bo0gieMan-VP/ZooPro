
public class Hipo extends Mammal {
    private double fatPercentage;

    public Hipo(double fatPercentage, int monthOfPregnancy, int amountCalsInMilk) {
        super(false, (int) ((Math.random() * 2000) + 2000), monthOfPregnancy, amountCalsInMilk);
        this.fatPercentage = fatPercentage;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHipo: " +
                "\n     Fat percentage: " + fatPercentage;
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }
}
