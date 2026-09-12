public class Book {
    private String titleBook;
    private Author author;
    private int publication;

    public Book (String titleBook, Author author, int publication) {
        this.titleBook = titleBook;
        this.author = author;
        this.publication = publication;
    }

    public String getTitleBook() {
    return this.titleBook;
    }
    public Author getAuthor() {
        return this.author;
        }
    public int getPublication() {
        return this.publication;
        }

    public void setPublication (int publication) {
        this.publication = publication;
    }
}
