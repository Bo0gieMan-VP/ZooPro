
public class Snake extends Reptile {
    private boolean poisonous;

    public Snake(boolean poisonous, double tailLength) {
        super(tailLength, false, (int) ((Math.random() * 600) + 600));
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSnake: " +
                "\n     Poisonous: " + poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public void dance() {
        System.out.println("Every snake dance!");
    }
}
