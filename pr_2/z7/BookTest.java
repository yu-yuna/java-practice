public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
        Book book2 = new Book("1984", "Джордж Оруэлл", 1949);
        Book book3 = new Book("Гарри Поттер", "Джоан Роулинг", 1997);
        Book book4 = new Book("Преступление и наказание", "Фёдор Достоевский", 1866);

        Book[] books = {book1, book2, book3, book4};

        BookShelf shelf = new BookShelf(books);

        System.out.println("Книги на полке:");
        shelf.showBooks();

        System.out.println("\nСамая старая книга:");
        System.out.println(shelf.findOldestBook());

        System.out.println("\nСамая новая книга:");
        System.out.println(shelf.findNewestBook());

        shelf.sortByYear();

        System.out.println("\nКниги после сортировки:");
        shelf.showBooks();
    }
}