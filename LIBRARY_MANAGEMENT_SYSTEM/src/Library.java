//importing the required classes
import java.util.*;

public class Library {// start of main class

    // creating an array list collection frame work to store the details of the
    // library books
    ArrayList<Book> books = new ArrayList<Book>();

    // method for adding the book in the library.
    public void addBook(Book book) {

        // to prevent adding the same book with isbn number
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("ERROR: A Book with same ISBN already exists");
                return;
            }
        }

        books.add(book);
        System.out.println("Book Added:" + book.getTitle());
    }

    // method for removing the book in the library.
    // here im going to delete the book using book isbn number
    // [here im using isbn because it is an unique identity number]
    public boolean removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                return true;
            }
        }
        System.out.println("Book with isbn : " + isbn + " not found.");
        return false;
    }

    // methods for displaying the books in the library
    public void displayBook() {
        if (books.isEmpty()) {
            System.out.println("The Library is Empty");
        } else {
            System.out.println("The Books in the Library are:");

            // putting for each loop
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    /**
     * Task-3
     * going to develop issue,return and book issue status
     */

    // method for issuing the book
    public boolean issueBook(String isbn) {
        // To Check the library is Empty.
        if (books.isEmpty()) {
            System.out.println("The Library is Empty.");
            return false;
        }

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isIssued()) {
                    book.setIssued(true);
                    System.out.println("Book Issued :" + book.getTitle());
                    return true;
                } else {
                    System.out.println("Book already Issued");
                    return false;
                }
            }
        }

        System.out.println("Book with ISBN " + isbn + " not found.");
        return false;
    }

    // method for returning the book.
    public boolean returnBook(String isbn) {
        // To Check the library is Empty.
        if (books.isEmpty()) {
            System.out.println("The Library is Empty.No Books to remove from the Library");
            return false;
        }

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isIssued()) {
                    book.setIssued(false);
                    System.out.println("Book returned :" + book.getTitle());
                    return true;
                } else {
                    System.out.println("Book was not issued :" + book.getTitle());
                    return false;
                }
            }
        }
        System.out.println("Book with ISBN " + isbn + " not Found.");
        return false;
    }

    // method to check the status of the book.

    public void checkIssueStatus(String isbn) {
        // To Check the library is Empty.
        if (books.isEmpty()) {
            System.out.println("The Library is Empty.");
            return;
        }

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                String status;// to know the status of the book is issued or not
                status = book.isIssued() ? "Issued" : "Not Issued";
                System.out.println("Book Title : " + book.getTitle() + "\nstatus:" + status);
                return;
            }
        }
        System.out.println("Book with isbn " + isbn + " not found");
    }

    // task->5
    // searching and sorting development

    // implementing search function using three types[here all types are string so
    // no problem]
    public void searchBook(String searchTerm) {
        boolean found = false;

        if (books.isEmpty()) {
            System.out.println(
                    "No Books Available in the Library.[LIBRARY IS TEMPORARILY OUT OF BOOKS TRY SOMETIME LATER]");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTerm.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(searchTerm.toLowerCase())
                    || book.getIsbn().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book Not Available in the Library.");
        }
    }

    // To implement Sorting according to different input types.
    // Used comparator concept for our own requirment sorting.
    // Sorting books by title
    public void sortBooksByTitle() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });
        System.out.println("Books sorted by title.");
    }

    // Sorting books by author
    public void sortBooksByAuthor() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getAuthor().compareTo(book2.getAuthor());
            }
        });
        System.out.println("Books sorted by author.");
    }

    // Sorting books by ISBN
    public void sortBooksByIsbn() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getIsbn().compareTo(book2.getIsbn());
            }
        });
        System.out.println("Books sorted by ISBN.");
    }

    public static void main(String[] args) {// start of main method

        // MANUAL TESTING STARTS HERE
        /*
         * Library library = new Library();
         * 
         * // Create some books
         * Book book1 = new Book("SHRD", "RDSH", "12345");
         * Book book2 = new Book("2023CWC", "PAT", "54321");
         * 
         * // Add books to the library
         * library.addBook(book1);
         * library.addBook(book2);
         * 
         * // Display all books
         * library.displayBook();
         * 
         * // Remove a book
         * library.removeBook("2023CWC");
         * 
         * // Display remaining books
         * library.displayBook();
         * 
         * System.out.println("\n\n\n\n\n\n\n\n");
         * 
         * // testing the issuestatus method
         * System.out.println("testing the issue method");
         * library.checkIssueStatus("12345");
         * library.checkIssueStatus("54321");
         * 
         * // testing the issuing method
         * System.out.println("\n");
         * System.out.println("issuing the book");
         * library.issueBook("12345");
         * library.checkIssueStatus("12345");
         * 
         * // testing the returning method
         * System.out.println("\n");
         * System.out.println("returning the book");
         * library.returnBook("12345");
         * library.checkIssueStatus("12345");
         * 
         * System.out.println("\n\n\n");
         * System.out.println("Test for an Incorrect isbn");
         * library.issueBook("09876");
         * 
         * System.out.println("\n\n\n\n");
         * System.out.println("-----------------TESTING COMPLETED-----------------");
         */

        // MANUAL TETSTING ENDS HERE.

        // Task-4[Make it as user friendly menu driven program].

        // initializing variables to pass input to the constructor or taking user input
        String title;
        String author;
        String isbn;
        int choice;

        // creating object for the class
        Library library = new Library();
        Scanner in = new Scanner(System.in);
        // creating scanner object

        while (true) {
            System.out.println("\n\n");
            System.out.println("MENU");
            System.out.println("1.ADD BOOK");
            System.out.println("2.REMOVE BOOK");
            System.out.println("3.DISPLAY ALL BOOKS");
            System.out.println("4.ISSUE BOOK");
            System.out.println("5.RETURN BOOK");
            System.out.println("6.CHECK ISSUE STATUS");
            System.out.println("7.SEARCH BOOK BY TITLE/AUTHOR/ISBN");
            System.out.println("8.SORT BOOKS");
            System.out.println("9.EXIT");

            System.out.println("NOTE:ALL THE ACTIONS THAT ARE PERFORMED ARE DONE BY UNIQUE ISBN NUMBER");
            System.out.println("\n");
            // taking input for the choice.
            System.out.print("Enter the Choice:");
            choice = in.nextInt();
            // to make the program bug-free
            in.nextLine();// based on my previous bug experience.

            System.out.println("\n");
            // starting the menu driven program
            switch (choice) {// start of switch

                case 1:// here we can add the book to the libraray by giving the details.
                {
                    System.out.print("ENTER THE NAME OF THE BOOK:");
                    title = in.nextLine();

                    System.out.print("ENTER THE AUTHOR OF THE BOOK:");
                    author = in.nextLine();

                    System.out.print("ENTER THE ISBN NUMEBER OF THE BOOK:");
                    isbn = in.nextLine();

                    library.addBook(new Book(title, author, isbn));
                    System.out.println("\n");
                    break;
                }

                // case 2[To Remove a Book From the Library]
                case 2: {
                    String removeIsbn;
                    System.out.print("Enter the isbn Number of the book you want to remove:");
                    removeIsbn = in.nextLine();
                    library.removeBook(removeIsbn);
                    System.out.println("\n");
                    break;
                }

                // to display the available books in the library

                case 3: {
                    // displaying all the books.
                    library.displayBook();
                    System.out.println("\n");
                    break;
                }

                // to issue the book.
                case 4: {
                    String issueIsbn;
                    System.out.print("Enter the isbn Number of the book you want to issue:");
                    issueIsbn = in.nextLine();
                    library.issueBook(issueIsbn);
                    System.out.println("\n");
                    break;
                }

                // to return the issued book
                case 5: {
                    String returnIsbn;
                    System.out.print("Enter the isbn Number of the book you want to return:");
                    returnIsbn = in.nextLine();
                    library.returnBook(returnIsbn);
                    System.out.println("\n");
                    break;
                }

                // To check the issue status of the book.
                case 6: {
                    String issueStatusIsbn;
                    System.out.print("Enter the ISBN of the book you want to check the Issue Status:");
                    issueStatusIsbn = in.nextLine();
                    library.checkIssueStatus(issueStatusIsbn);
                    System.out.println("\n");
                    break;
                }

                // To search book from the library.
                case 7: {
                    String searchterm;
                    System.out.print("Enter any of the search information [Example:Title/Author/Isbn]:");
                    searchterm = in.nextLine();
                    library.searchBook(searchterm);
                    System.out.println("\n");
                    break;
                }

                // to sort the books in the library
                case 8: {
                    System.out.println("SORTING TYPES");
                    System.out.println("1.SORT BY TITLE");
                    System.out.println("2.SORT BY AUTHOR");
                    System.out.println("3.SORT BY ISBN");

                    int sortChoice = in.nextInt();
                    in.nextLine();// to make it as bug free.[prevoius testing experience]

                    switch (sortChoice) {// start of sort switch.
                        case 1: {
                            library.sortBooksByTitle();
                            library.displayBook();
                            break;
                        }

                        case 2: {
                            library.sortBooksByAuthor();
                            library.displayBook();
                            break;
                        }

                        case 3: {
                            library.sortBooksByIsbn();
                            library.displayBook();
                            break;
                        }
                        default: {
                            System.out.println("Enter the correct choice");
                        }
                    }// end of start switch.
                    System.out.println("\n");
                    break;
                }

                // to exit the program
                case 9: {
                    System.out.print("Are you Sure You want to Exit:[YES/NO]");
                    String confirmation = in.nextLine();
                    if (confirmation.equalsIgnoreCase("yes"))
                    {
                        System.out.println("-----------PROGRAM EXITED-------------");
                        in.close();
                        return;
                    }
                }

                // to make the user to return to the menu option if he accidentally presses the
                // wrong option.
                default: {
                    System.out.println("\n");
                    System.out.println("Enter the Correct Option");
                    System.out.println("\n");
                }
            }// end of switch
        }
    }// end of main method
}// end of main class