package gr.aueb.cf.ch14;

public class AnimalMain {

    public static void main(String[] args) {

        Dog dog= new Dog ("Lemmy", 2, "Husky");
        dog.makeSound();
        dog.searchForFood();

        doMakesound(dog);
    }


    public static void doMakesound(Animal animal){
        animal.makeSound();


    }
}

