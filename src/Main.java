import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        List<Client> clientList = new ArrayList<>();
        int n = 5;

        for (int i = 0; i < n; i++) {
            clientList.add(new Client(mediator));
        }

        for (int i = 0; i < n; i++) {
            mediator.addClient(clientList.get(i));
        }

        clientList.get(0).sendMessage("Hi from 1");
        clientList.get(1).sendMessage("Bye from 2");
        clientList.get(2).sendMessage("Hi from 3");
        clientList.get(3).sendMessage("Bye from 4");

        for (int i = 0; i < n; i++) {
            System.out.println("Client " + (i + 1) + " messages");
            System.out.println("-----------------");
            clientList.get(i).printMessageList();
            System.out.println("-----------------");
        }
    }
}
