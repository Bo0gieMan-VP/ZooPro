
public abstract class Reptile extends Animal {
    private double tailLength;

    public Reptile(double tailLength, boolean supperPredator, int calsPerMeal) {
        super( supperPredator, calsPerMeal);
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return super.toString()+"\nReptile: " +
                "\n     Tail length: " + tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }
}
