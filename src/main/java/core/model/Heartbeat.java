package core.model;

public class Heartbeat {

    public Heartbeat(long id, String content) {
        this.id = id;
        this.content = content;
    }

    private final long id;
    private final String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
