//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        book book1 = new book("JED THE GREAT", "JED SURABASQUEZ", 328);
        book book2 = new book("BOB THE EXPLORER", "LUNS", 281);
        book book3 = new book("ANJO IS GAY", "ADRIAN", 180);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}