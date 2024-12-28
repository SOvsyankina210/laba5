import java.time.LocalDate;
import java.util.Arrays;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private LocalDate dateOfBirth;
    private String phone;

    public Reader(String fullName, int libraryCardNumber, String faculty, LocalDate dateOfBirth, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }


    //takeBook
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        System.out.println(String.join(", ", bookTitles));
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        String[] titles = Arrays.stream(books)
                .map(Book::getTitle)
                .toArray(String[]::new);
        System.out.println(String.join(", ", titles));
    }


    //returnBook
    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        System.out.println(String.join(", ", bookTitles));
    }
    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        String[] titles = Arrays.stream(books)
                .map(Book::getTitle)
                .toArray(String[]::new);
        System.out.println(String.join(", ", titles));
    }


}
