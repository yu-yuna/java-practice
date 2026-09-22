package pr_2.z7;
public class BookShelf {
    private Book[] books;

    public BookShelf(Book[] books) {
        this.books = books;
    }

    public Book findOldestBook() {
        Book oldest = books[0];

        for (Book book : books) {
            if (book.getYear() < oldest.getYear()) {
                oldest = book;
            }
        }

        return oldest;
    }

    public Book findNewestBook() {
        Book newest = books[0];

        for (Book book : books) {
            if (book.getYear() > newest.getYear()) {
                newest = book;
            }
        }

        return newest;
    }

    public void sortByYear() {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {

                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}