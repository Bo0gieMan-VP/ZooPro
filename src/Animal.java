public abstract class Animal {

    private String name;
    private int age;
    private boolean supperPredator;
    private int calsPerMeal;

    public Animal(boolean supperPredator, int calsPerMeal) {
        String[] names = {"Dude","Gadi", "Amit", "Daniel", "Benny", "Dario", "Sagi", "Rom", "Ron", "Noy", "Shahar", "Aviram", "Avi", "Shaar", "Shir"};
        this.name = names[(int) (Math.random() * names.length)];
        this.age = (int) (Math.random() * 20) + 1;
        this.supperPredator = supperPredator;
        this.calsPerMeal = calsPerMeal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSupperPredator() {
        return supperPredator;
    }

    public void setSupperPredator(boolean supperPredator) {
        this.supperPredator = supperPredator;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "\n     Name: " + name +
                "\n     Age: " + age +
                "\n     Supper predator: " + supperPredator +
                "\n     Cals per meal: " + calsPerMeal;
    }

    public int getCalsPerMeal() {
        return calsPerMeal;
    }

    public void setCalsPerMeal(int calsPerMeal) {
        this.calsPerMeal = calsPerMeal;
    }

    public int eat() {
        return this.calsPerMeal * 3;
    }

}
