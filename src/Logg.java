import java.io.Serializable;
import java.util.Date;

public class Logg implements Serializable {
    private Date createdAt;
    private Date updatedAt;
    private String message;
    private String person;

    public Logg(String person, String message) {
        this.message = message;
        createdAt = new Date();
        updatedAt = new Date();
        this.person = person;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public String getMessage() {
        return message;
    }
    public String getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "LogEntry{" + "createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", message='" + message + '\'' + '}';
    }

    // Optional: add old version to history
    public void update(String newMessage) {
        message = newMessage;
        updatedAt = new Date();
    }
}