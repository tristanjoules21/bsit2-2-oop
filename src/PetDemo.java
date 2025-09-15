public class PetDemo {
    public static void trainPet(Trainable pet) {
        pet.performTrick();
    }

    public static void main(String[] args) {
        Pet[] pets = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 2),
                new Bird("Tweety", 1)
        };

        System.out.println("=== Pet Info and Sounds ===");
        for (Pet pet : pets) {
            pet.displayInfo();
            pet.makeSound();
            System.out.println();
        }

        System.out.println("=== Training Pets ===");
        trainPet((Trainable) pets[0]); // Dog
        trainPet((Trainable) pets[2]); // Bird
    }
}
