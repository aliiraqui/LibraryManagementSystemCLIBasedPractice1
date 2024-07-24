package action;

import domain.Book;
import domain.Member;

import java.util.*;


public class Library implements LibraryAction {

    private final List<Book> bookList;
    private final Map<Integer, Member> memberList;
    private final Map<String, Book> issuedList;

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
    public void removeBook(String title) {
        for (Book book : bookList) {
            String bookTitle = book.getTitle();
            if (bookTitle.equalsIgnoreCase(title)) {
                bookList.remove(book);
                System.out.println("~~~ Book Removed ~~~");
                return;
            }

        }
        System.out.println("~~~ Book Not Found ~~~");
    }

    @Override
    public void addMember(Member member) {
        memberList.put(member.getMemberId(), member);
        System.out.println(member.getName() + "~~~ Added Successfully ~~~");
    }

    @Override
    public void removeMember(int memberID) {
        for (Member member : memberList.values()) {
            if (member.getMemberId() == memberID) {
                memberList.remove(memberID);
                System.out.println("~~~ Member Removed ~~~");
                return;
            }

        }
        System.out.println("~~~ Member Not Found ~~~");
    }

    @Override
    public void issueBook(int memberID, String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                Member member = memberList.get(memberID);
                if (member != null) {
                    issuedList.put(title, book);
                    System.out.println("~~~ Book Issued ~~~");
                    book.setIssued(true);
                }
                System.out.println("~~~ Member Not Found ~~~");
            }
            System.out.println("~~~ Book Not found ~~~");
        }
    }

    @Override
    public void returnBook(String title) {
        Book removeBook = issuedList.remove(title);
        if (removeBook != null) {
            removeBook.setIssued(false);
            System.out.println("~~~ Book returned ~~~");
        } else {
            System.out.println("~~~ Book not found ~~~");
        }
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
        List<Member> member = new ArrayList<>(memberList.values());
        Collections.sort(member);
    }


}
