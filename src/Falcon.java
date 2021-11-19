
public class Falcon extends Bird{
    private boolean canFly;

    public Falcon(boolean canFly, double wingLength, int flightHeight) {
        super(wingLength, flightHeight, true, (int) ((Math.random() * 700) + 700));
        this.canFly=canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return "\nFalcon: " +
                "\n     Can fly: " + canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
