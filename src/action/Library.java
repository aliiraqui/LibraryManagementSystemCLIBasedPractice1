package action;

import domain.Book;
import domain.Member;

import java.util.*;


public class Library implements LibraryAction {

    private List<Book> bookList;
    private Map<Integer, Member> memberList;
    private Map<String, Book> issuedList;

    public Library() {
        bookList = new ArrayList<>();
        memberList = new HashMap<>();
        issuedList = new HashMap<>();
    }

    @Override
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println(book.getTitle() + " Added Successfully");
    }

    @Override
    public void addMember(Member member) {
        memberList.put(member.getMemberId(), member);
        System.out.println(member.getName() + "Added Successfully");
    }

    @Override
    public void issueBook(int memberID, String title) {

    }

    @Override
    public void returnBook(String title) {

    }

    @Override
    public void listAllBook() {
        for (Book book : bookList) {
            book.display();
        }
    }

    @Override
    public void listAllMember() {
        for (Member member : memberList.values()) {
            member.display();
        }

    }

    @Override
    public void searchBookByTitle(String title) {
        for (Book book : bookList) {
            if (title.equalsIgnoreCase(book.getTitle())) {
                System.out.println("~~~ Book Found ~~~");
                book.display();
            }
        }
    }

    @Override
    public void sortBook() {
        Collections.sort(bookList);
    }

    @Override
    public void sortMember() {

    }


}
