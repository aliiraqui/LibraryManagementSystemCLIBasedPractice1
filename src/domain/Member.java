package domain;

public class Member extends Person {
    private final int memberId;

    public Member(String name, int memberId) {
        super(name);
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void display() {
        System.out.println("~~~ Member ~~~\n" +
                "Name: " + getName() + "\n" +
                "Member ID: " + memberId);
    }
}
