import javazoom.jl.player.Player;

import java.io.FileInputStream;

public abstract class Bird extends Animal {
    private int flightHeight;
    private double wingLength;

    public Bird(double wingLength, int flightHeight, boolean supperPredator, int calsPerMeal) {
        super(supperPredator, calsPerMeal);
        this.flightHeight = flightHeight;
        this.wingLength = wingLength;
    }

    @Override
    public String toString() {
        return "\nBird: " +
                "\n     Flight Height: " + flightHeight +
                "\n     Wing length: " + wingLength;
    }

    public int getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(int flightHeight) {
        this.flightHeight = flightHeight;
    }

    public double getWingLength() {
        return wingLength;
    }

    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }

    public int eat() {
        return super.eat() / 10;
    }

    public void sing() {
        try {
            FileInputStream fis = new FileInputStream("songs/falconSing.mp3");
            Player playMP3 = new Player(fis);
            playMP3.play();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void dance() {
        System.out.println("Every bird dance!");
    }

}
