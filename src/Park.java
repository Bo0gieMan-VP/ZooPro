
public class Park {
    private static int animalsCounter = 0;
    private Animal[] zooAnimals = new Animal[1000];

    public Park() {
        System.out.println("A zoo was created!");
    }

    public static int getAnimalsCounter() {
        return animalsCounter;
    }

    public static void setAnimalsCounter(int animalsCounter) {
        Park.animalsCounter = animalsCounter;
    }

    public Animal[] getZooAnimals() {
        return zooAnimals;
    }

    public void setZooAnimals(Animal[] zooAnimals) {
        this.zooAnimals = zooAnimals;
    }

    public void addAnimal(Animal animal) {
// add an animal to the zoo
        if (zooAnimals[zooAnimals.length - 1] == null) {
            zooAnimals[animalsCounter++] = animal;
            System.out.println(animal.getName() + " Was added");
        } else {
            System.out.println("ZOO IS FULL!");
        }
    }

    public Animal[] over10AndPredator() {
// return an array of all the animal older the 10 and a predator
        Animal[] predatorArr = {};
        for (int i = 0; i < getZooAnimals().length; i++) {
            if (getZooAnimals()[i] == null) {
                break;
            } else if (getZooAnimals()[i].getAge() > 10 && getZooAnimals()[i].isSupperPredator()) {
                predatorArr = extendArray(predatorArr, getZooAnimals()[i]);
            }
        }
        return predatorArr;
    }


    public int birdsAndReptilePredator() {
// return an array of all the birds older and Reptile and a predator
        int predatorArr = 0;
        for (int i = 0; i < getZooAnimals().length; i++) {
            if (getZooAnimals()[i] == null) {
                break;
            } else if (getZooAnimals()[i].isSupperPredator()) {
                if (getZooAnimals()[i] instanceof Reptile || getZooAnimals()[i] instanceof Bird)
                    ++predatorArr;
            }
        }
        return predatorArr;
    }

    private Animal[] extendArray(Animal[] animalsArr, Animal animal) {
        Animal[] arr = new Animal[animalsArr.length + 1];
        System.arraycopy(animalsArr,0,arr,0,animalsArr.length+1);
        arr[animalsArr.length-1] = animal;
        return arr;
    }
}
