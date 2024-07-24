package domain;

public class Member extends Person implements Comparable<Member> {
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


    @Override
    public int compareTo(Member o) {
        return Long.compare(o.getId(), this.getId());
    }
}
