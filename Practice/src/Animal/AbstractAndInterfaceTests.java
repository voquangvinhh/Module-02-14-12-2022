package Animal;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        AnimalPractice[] animalPractices = new AnimalPractice[2];
        animalPractices[0] = new Tiger();
        animalPractices[1] = new chicken();
        for (AnimalPractice animalPractice : animalPractices){
            System.out.println(animalPractice.makeSound());

            if (animalPractice instanceof chicken){
                Edile edile = (chicken) animalPractice;
                System.out.println(edile.howToEat());
            }
        }
    }
}
