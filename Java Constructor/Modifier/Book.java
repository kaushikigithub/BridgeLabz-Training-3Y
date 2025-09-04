class Book {
    public String ISBN;        // Public
    protected String title;    // Protected
    private String author;     // Private

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods to access private variable
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

// Subclass demonstrating access
class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        // Accessing public (ISBN) and protected (title)
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }
}
