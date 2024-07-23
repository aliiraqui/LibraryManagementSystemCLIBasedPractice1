package domain;

public abstract class AbstractEntity {
    private static long idCounter = 0;
    private final long id;

    public AbstractEntity() {
        this.id = idCounter++;
    }

    public long getId() {
        return id;
    }

    public abstract void display();
}
