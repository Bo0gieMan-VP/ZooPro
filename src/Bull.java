
public class Bull extends Cow {

    private int daysCanWorkInWeek;

    public Bull(int daysCanWorkInWeek) {
        super(0, false, (int) ((Math.random() * 1700) + 1700), 0, 0);
        this.daysCanWorkInWeek = daysCanWorkInWeek;
    }

    public int getDaysCanWorkInWeek() {
        return daysCanWorkInWeek;
    }

    @Override
    public String toString() {
        return "\nBull: " +
                "\n     Days can work in a week:" + daysCanWorkInWeek;
    }

    public void setDaysCanWorkInWeek(int daysCanWorkInWeek) {
        this.daysCanWorkInWeek = daysCanWorkInWeek;
    }
}
