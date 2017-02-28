import java.util.ArrayList;
import java.util.List;

public class Client {
    private Mediator mediator;
    List<String> messageList;

    public Client(Mediator mediator) {
        this.mediator = mediator;
        messageList = new ArrayList<>();
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        messageList.add(message);
    }

    public void printMessageList() {
        messageList.forEach(System.out::println);
    }
}
