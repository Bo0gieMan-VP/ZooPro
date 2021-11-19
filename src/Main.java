import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {


        Crocodile a1 = new Crocodile(true, 60);
        Bull a2 = new Bull(5);
        Falcon a3 = new Falcon(true, 60, 200);
        Hipo a4 = new Hipo(34, 11, 200);
        Snake a5 = new Snake(true, 40);
        Hipo a6 = new Hipo(45, 11, 200);

        Animal[] animalsArr = {a1, a2, a3, a4, a5, a6};

        System.out.println(sumOfCal(animalsArr));
        System.out.println(mostFatHipo(animalsArr));
        ifBirdSing(animalsArr);
        try {
            ifCanDance(animalsArr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        Park p = new Park();
        for (int i = 0; i < animalsArr.length; i++) {
            p.addAnimal(animalsArr[i]);
        }


        for (Animal animal : p.over10AndPredator()) {
            if (animal != null) {
                System.out.println(animal.getName());
            } else {
                break;
            }
        }

        System.out.println(p.birdsAndReptilePredator());
    }

    public static int sumOfCal(Animal[] arr) {
//the sum of all the calories off all the animals in the array
        int sumCals = 0;
        for (int i = 0; i < arr.length; i++) {
            sumCals += arr[i].eat();
        }
        return sumCals;
    }

    public static void ifBirdSing(Animal[] arr) {
// if it's a bird then sing
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Bird) {
                ((Bird) arr[i]).sing();
            }
        }

    }

    public static void ifCanDance(Animal[] arr) throws MalformedURLException {
// if he can dance (birds and snakes) he will dance
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Bird) {
                ((Bird) arr[i]).dance();
            } else if (arr[i] instanceof Snake) {
                ((Snake) arr[i]).dance();
            }
        }
    }

    public static String mostFatHipo(Animal[] arr) {
//Give back the most fat hipo
        double fatPer = 0;
        String hipoName = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Hipo) {
                if (((Hipo) arr[i]).getFatPercentage() > fatPer) {
                    fatPer = ((Hipo) arr[i]).getFatPercentage();
                    hipoName = arr[i].getName();
                }
            }
        }
        return hipoName;
    }
}