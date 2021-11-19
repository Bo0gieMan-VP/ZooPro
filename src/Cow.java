
public class Cow extends Mammal {
    private int numOfBirths;

    public Cow(int numOfBirths, boolean supperPredator, int ofPregnancy, int monthOfPregnancy, int amountCalsInMilk) {
        super(supperPredator, (int) ((Math.random() * 1000) + 1000), monthOfPregnancy, amountCalsInMilk);
        this.numOfBirths = numOfBirths;
    }

    public int getNumOfBirths() {
        return numOfBirths;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCow: " +
                "\n     Number of births: " + numOfBirths ;
    }

    public void setNumOfBirths(int numOfBirths) {
        this.numOfBirths = numOfBirths;
    }


    public int eat(){
        return super.eat() /4;
    }
}
