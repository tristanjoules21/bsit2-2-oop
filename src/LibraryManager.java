import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
        System.out.println("Added: " + ((LibraryItem) item).getItemInfo());
    }

    public void displayAllItems() {
        for (Borrowable item : items) {
            LibraryItem li = (LibraryItem) item;
            System.out.println(li.getItemType() + ": " + li.title + " (" + item.getBorrowingStatus() + ")");
        }
    }

    public void displayAvailableItems() {
        for (Borrowable item : items) {
            if (item.isAvailable()) {
                LibraryItem li = (LibraryItem) item;
                System.out.println(li.getItemType() + ": " + li.title + " (" + item.getBorrowingStatus() + ")");
            }
        }
    }

    public void borrowItem(String itemId, String borrowerName) {
        for (Borrowable item : items) {
            LibraryItem li = (LibraryItem) item;
            if (li.itemId.equals(itemId) && item.isAvailable()) {
                item.borrowItem(borrowerName);
                System.out.println(borrowerName + " borrowed: " + li.title);
                return;
            }
        }
        System.out.println("Item with ID " + itemId + " not found or already borrowed.");
    }

    public void returnItem(String itemId) {
        for (Borrowable item : items) {
            LibraryItem li = (LibraryItem) item;
            if (li.itemId.equals(itemId) && !item.isAvailable()) {
                item.returnItem();
                System.out.println("Returned: " + li.title);
                return;
            }
        }
        System.out.println("Item with ID " + itemId + " not found or not currently borrowed.");
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0;
        for (Borrowable item : items) {
            LibraryItem li = (LibraryItem) item;
            if (!item.isAvailable()) {
                total += li.calculateLateFee(daysLate);
            }
        }
        return total;
    }
}
