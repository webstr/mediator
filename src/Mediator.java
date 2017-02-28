import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Client> clientList;

    public Mediator() {
        clientList = new ArrayList<>();
    }

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void sendMessage(String message, Client client) {
        clientList.stream().filter(i -> i != client).forEach(i -> {
            i.receiveMessage(message);
        });
    }
}
