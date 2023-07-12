import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Animal> animalQueue;
    private int order; // Represents the order of arrival

    public AnimalShelter() {
        animalQueue = new LinkedList<>();
        order = 0;
    }

    public void enqueue(Animal animal) {
        animal.setOrder(order++);
        animalQueue.add(animal);
    }

    public Animal dequeueAny() {
        if (animalQueue.isEmpty()) {
            return null; // No animals in the com.keyin.shelter
        }
        return animalQueue.poll();
    }

    public Dog dequeueDog() {
        for (Animal animal : animalQueue) {
            if (animal instanceof Dog) {
                animalQueue.remove(animal);
                return (Dog) animal;
            }
        }
        return null; // No dogs available
    }

    public Cat dequeueCat() {
        for (Animal animal : animalQueue) {
            if (animal instanceof Cat) {
                animalQueue.remove(animal);
                return (Cat) animal;
            }
        }
        return null; // No cats available
    }
}