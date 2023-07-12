/*
TODO: An animal com.keyin.shelter, which holds only dogs and cats, operates on a strictly
 "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
  all animals at the com.keyin.shelter, or they can select whether they would
  prefer a dog or a cat (and will receive the oldest animal of that type).
   They cannot select which specific animal they would like.
 Create the data structures to maintain this system and implement
 operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
 */
// Completed by Darla Ward
// Completed on July 11, 2023
public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Enqueue some animals
        shelter.enqueue(new Dog("Cupcake"));
        shelter.enqueue(new Dog("Jewels"));
        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Cat("Snow"));
        shelter.enqueue(new Dog("Max"));
        shelter.enqueue(new Cat("Mittens"));

        // Adopting either dog/cat
        Animal adoptedAnimal1 = shelter.dequeueAny();
        if (adoptedAnimal1 != null) {
            System.out.println("Adopted: " + adoptedAnimal1.getName());
        }

        // Adopting a dog
        Dog adoptedDog = shelter.dequeueDog();
        if (adoptedDog != null) {
            System.out.println("Adopted dog: " + adoptedDog.getName());
        }

        // Adopting a cat
        Cat adoptedCat = shelter.dequeueCat();
        if (adoptedCat != null) {
            System.out.println("Adopted cat: " + adoptedCat.getName());
        }
    }
}
