
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Джейн", "Остин");
        Author author2 = new Author("Виктор", "Гюго");

        Book book1 = new Book("Гордость и предубеждение", author1, 1813);
        Book book2 = new Book("Собор Парижской Богоматери", author2, 1831);

        System.out.println(book1.getTitleBook() + " - " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getLastNameAuthor() + ", " + book1.getPublication());
        System.out.println(book2.getTitleBook() + " - " + book2.getAuthor().getNameAuthor() + " " + book2.getAuthor().getLastNameAuthor() + ", " + book2.getPublication());

        book1.setPublication (1814);
        System.out.println("Новый год публикации: " + book1.getTitleBook() + " - " + book1.getPublication());
    }
    }

