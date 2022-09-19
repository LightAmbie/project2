package mirea.ru.lazarev_pavel.kvbo0121;

public class TestAuth {
    public static void main(String[] args) {
        Author author = new Author("Pasha", "lightambie@gmail.com", 'm');
        System.out.println(author.getName().equals("Pasha"));
        System.out.println(author.getEmail().equals("lightambie@gmail.com"));
        System.out.println(author.getGender()=='m');
    }
}
