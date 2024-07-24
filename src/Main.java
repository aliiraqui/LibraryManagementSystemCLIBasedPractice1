import action.Library;
import domain.Book;
import domain.Member;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Press 1 to Add Book: ");
            System.out.println("Press 2 to Add Member: ");
            System.out.println("Press 3 to Remove Book: ");
            System.out.println("Press 4 to Remove Member: ");
            System.out.println("Press 5 to Issue Book: ");
            System.out.println("Press 6 to Return Book: ");
            System.out.println("Press 7 to List All Book: ");
            System.out.println("Press 8 to List All Member: ");
            System.out.println("Press 9 to Search Book: ");
            System.out.println("Press 10 to Sort Book: ");
            System.out.println("Press 11 to Sort Member: ");
            System.out.println("Press 0 to Exit: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Adding Book......");
                    System.out.println("Enter book title");
                    String title = scanner.next();

                    System.out.println("Enter book author");
                    String author = scanner.next();

                    System.out.println("Enter book genre");
                    String genre = scanner.next();
                    library.addBook(new Book(title, author, genre));
                    break;
                case 2:
                    System.out.println("Adding a member ");
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter member Id : ");
                    int memberId = scanner.nextInt();
                    library.addMember(new Member(name, memberId));
                    break;
                case 3:
                    System.out.println("Removing Book");

                    scanner.nextLine();
                    System.out.println("Enter the Book title to Remove: ");
                    String titleOfRemovingBook = scanner.nextLine();

                    library.removeBook(titleOfRemovingBook);
                    break;

                case 4:
                    System.out.println("Removing Member");

                    System.out.println("Enter Member ID Number: ");
                    int memberIDToRemove = scanner.nextInt();

                    library.removeMember(memberIDToRemove);
                    break;
                case 5:
                    System.out.println("Enter member id");
                    int memId = scanner.nextInt();
                    System.out.println("Book title to be issued");
                    String memName = scanner.next();
                    library.issueBook(memId, memName);
                    break;
                case 6:
                    System.out.println("Enter book title to return");
                    String returnBookTitle = scanner.next();
                    library.returnBook(returnBookTitle);
                    break;
                case 7:
                    library.listAllBook();
                    break;
                case 8:
                    library.listAllMember();
                    break;
                case 9:
                    System.out.println("Enter book title");
                    String bookTitle = scanner.next();
                    library.searchBookByTitle(bookTitle);
                case 10:
                    library.sortBook();
                    break;
                case 11:
                    library.sortMember();
                    break;
            }

        } while (choice != 10);
    }
}