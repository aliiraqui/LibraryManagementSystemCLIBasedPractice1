package domain;

public class Book extends AbstractEntity implements Comparable<Book> {
    private final String title;
    private final String author;
    private final String genre;
    private boolean isIssued;

    public Book(String title, String author, String genre) {
        super();
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public void display() {
        System.out.println("~~~ Book ~~~\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Genre: " + genre + "\n" +
                "Is Issued? " + isIssued);
    }

    @Override
    public int compareTo(Book o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
