

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Alex", "alex@mail.com", 'M');
        Author author2 = new Author("Maya", "maya@mail.com", 'F');
        Author author3 = new Author("Dmitry", "dmitry@mail.com", 'M');

        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        author.setEmail("new@mail.com");
        System.out.println(author.getEmail());

        System.out.println(author);
        System.out.println(author2);
        System.out.println(author3);
    }
    
}
