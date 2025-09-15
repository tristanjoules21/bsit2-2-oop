public class PetClinicMain {
    public static void main(String[] args) {
        // Part 1 - PetService fee calculation
        PetService service = new PetService();
        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculate(true));
        System.out.println("Full service: $" + service.calculate(true, true));
        System.out.println("Emergency: $" + service.calculateFee("emergency"));

        System.out.println();

        // Part 2 - Runtime Polymorphism - Pet sound and info
        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("==========================");
        dog.displayInfo();
        dog.makeSound();
        System.out.println();
        cat.displayInfo();
        cat.makeSound();
        System.out.println();
        bird.displayInfo();
        bird.makeSound();

        System.out.println();

        // Part 3 - Interface Polymorphism - Training
        System.out.println("Training Session Started!");
        System.out.println("==========================");
        ((Trainable)dog).performTrick();
        ((Trainable)bird).performTrick();
    }
}

