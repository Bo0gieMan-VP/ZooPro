
public abstract class Mammal extends Animal {
    private int amountCalsInMilk;
    private int monthOfPregnancy;

    public Mammal(boolean supperPredator, int calsPerMeal, int monthOfPregnancy, int amountCalsInMilk) {
        super(supperPredator, calsPerMeal);
        this.amountCalsInMilk = amountCalsInMilk;
        this.monthOfPregnancy = monthOfPregnancy;
    }

    @Override
    public String toString() {
        return "\nMammal: " +
                "\n     Amount cals in milk: " + amountCalsInMilk +
                "\n     Month of pregnancy:" + monthOfPregnancy;
    }

    public double getAmountCalsInMilk() {
        return amountCalsInMilk;
    }

    public void setAmountCalsInMilk(int amountCalsInMilk) {
        this.amountCalsInMilk = amountCalsInMilk;
    }

    public int getMonthOfPregnancy() {
        return monthOfPregnancy;
    }

    public void setMonthOfPregnancy(int monthOfPregnancy) {
        this.monthOfPregnancy = monthOfPregnancy;
    }

    public int eat(){
        return super.eat() + this.amountCalsInMilk;
    }

}
