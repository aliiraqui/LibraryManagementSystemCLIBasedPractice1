package action;

import domain.Book;
import domain.Member;


public interface LibraryAction {
    void addBook(Book book);

    void removeBook(String title);

    void addMember(Member member);

    void removeMember(int memberID);

    void issueBook(int memberID, String title);

    void returnBook(String title);

    void listAllBook();

    void listAllMember();

    void searchBookByTitle(String title);

    void sortBook();

    void sortMember();

}
