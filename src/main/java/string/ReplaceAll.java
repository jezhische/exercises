package string;

/**
 * Created by WORK_x64 on 02.03.2017.
 */
public class ReplaceAll {
    Client client;
        private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
            System.out.println(message);
    }

    public static void main(String[] args) {
        ReplaceAll repl = new ReplaceAll();
        repl.client = new Client("5", "John Smith");
        repl.logEvent("5, John Smith");
    }
}
class Client {
    private String id, fullName;
    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
