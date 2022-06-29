import java.util.Scanner;

public class Library {

    private int totalBooks;
    private final String libraryName;
    private final Book[] listOfBooks;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        listOfBooks = new Book[100];
        totalBooks = 0;
    }

    public static void main(String[] args) {
        Library library = new Library("Rosary Library");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease select an option");
            System.out.println("Press 1 to add a book");
            System.out.println("Press 2 to show  books");
            System.out.println("Press 3 to remove last book");
            System.out.println("Press 4 to show total amount of books");
            System.out.println("Press 5 to show Library name");
            System.out.println("Press 6 to exit");

            switch (scan.nextInt()) {
                case 1:
                    String book_name, author_name, coverType, language;
                    System.out.println("Enter book name");
                    book_name = library.getInput();
                    System.out.println("Enter author name");
                    author_name = library.getInput();
                    System.out.println("Enter cover type of the book");
                    coverType = scan.next();
                    System.out.println("Enter book language");
                    language = scan.next();
                    Book book = new Book(book_name, author_name, coverType, language);
                    library.addBook(book);

                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    library.removeBook();
                    break;

                case 4:
                    System.out.println(library.totalBooks);
                    break;

                case 5:
                    System.out.println(library.libraryName);
                    break;

                case 6:
                    return;


                default:
                    System.out.println("invalid input");
                    break;

            }
        }
    }

    private String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void addBook(Book book) {
        listOfBooks[totalBooks] = book;
        totalBooks++;
    }

    public void showBooks() {
        for (int i = 0; i < totalBooks; i++) {
//            System.out.println(listOfBooks[i]);
            listOfBooks[i].printBook();
        }
    }

    public void removeBook() {
        totalBooks = totalBooks - 1;
    }


}
