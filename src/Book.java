// ---- Book ----
public class Book extends Media {
    private String author;
    public Book(String title, String itemId, String author) {
        super(title, itemId);
        this.author = author;
    }
    public String getMediaType() { return "Book"; }
    public void displayInfo() {
        System.out.println("Book: \"" + title + "\" by " + author + " (ID: " + itemId + ")");
    }
}

// ---- DVD ----
class DVD extends Media {
    private String director;
    public DVD(String title, String itemId, String director) {
        super(title, itemId);
        this.director = director;
    }
    public String getMediaType() { return "DVD"; }
    public void displayInfo() {
        System.out.println("DVD: \"" + title + "\" directed by " + director + " (ID: " + itemId + ")");
    }
}

// ---- Magazine ----
class Magazine extends Media {
    private int issueNumber;
    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }
    public String getMediaType() { return "Magazine"; }
    public void displayInfo() {
        System.out.println("Magazine: \"" + title + "\" Issue #" + issueNumber + " (ID: " + itemId + ")");
    }
}
