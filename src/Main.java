public class Main {
    public static void main(String[] args) {
        // Create LibraryManager
        LibraryManager manager = new LibraryManager();

        System.out.println("=== Adding Items to Library ===");
        // Create and add items
        Book book1 = new Book("B001", "Java Programming", "James Gosling", "1234567890", 500, "Programming");
        Book book2 = new Book("B002", "Data Structures", "Robert Lafore", "0987654321", 600, "CS");
        Magazine mag1 = new Magazine("M001", "Tech Today", "Editor Smith", 25, "October", true);
        Magazine mag2 = new Magazine("M002", "Science Weekly", "Editor Jane", 45, "September", false);
        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 120, "R", "Sci-Fi");
        DVD dvd2 = new DVD("D002", "Inception", "Christopher Nolan", 140, "PG-13", "Action");

        manager.addItem(book1);
        manager.addItem(book2);
        manager.addItem(mag1);
        manager.addItem(mag2);
        manager.addItem(dvd1);
        manager.addItem(dvd2);

        System.out.println("\n=== Displaying All Items ===");
        manager.displayAllItems();

        // Create Users
        Student student = new Student("U001", "John Smith", "john@example.com", "S123", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Smith", "smith@example.com", "Engineering", "Professor");

        System.out.println("\n=== Testing Borrowing ===");
        book1.borrowItem(student.getName());
        student.addBorrowedItem(book1);
        System.out.println("Student " + student.getName() + " borrowed: " + book1.title);

        dvd1.borrowItem(faculty.getName());
        faculty.addBorrowedItem(dvd1);
        System.out.println("Faculty " + faculty.getName() + " borrowed: " + dvd1.title);

        System.out.println("\n=== Displaying Available Items ===");
        manager.displayAvailableItems();

        System.out.println("\n=== Testing Late Fees ===");
        System.out.println(book1.title + " - 5 days late: $" + book1.calculateLateFee(5));
        System.out.println(dvd1.title + " - 3 days late: $" + dvd1.calculateLateFee(3));

        System.out.println("\n=== Displaying Borrowed Items ===");
        System.out.println("Student " + student.getName() + " has borrowed:");
        student.displayBorrowedItems();
        System.out.println("Faculty " + faculty.getName() + " has borrowed:");
        faculty.displayBorrowedItems();

        System.out.println("\n=== Testing Return Items ===");
        book1.returnItem();
        student.removeBorrowedItem(book1);
        System.out.println("Student returned: " + book1.title);

        dvd1.returnItem();
        faculty.removeBorrowedItem(dvd1);
        System.out.println("Faculty returned: " + dvd1.title);

        System.out.println("\n=== Displaying Available Items After Returns ===");
        manager.displayAvailableItems();

        System.out.println("\n=== Total Late Fees for 7 Days Late ===");
        double totalFees = manager.calculateTotalLateFees(7);
        System.out.println("Total late fees: $" + totalFees);
    }
}
