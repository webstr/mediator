
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Client client1 = new Client(mediator);
        Client client2 = new Client(mediator);
        Client client3 = new Client(mediator);
        Client client4 = new Client(mediator);

        mediator.addClient(client1);
        mediator.addClient(client2);
        mediator.addClient(client3);
        mediator.addClient(client4);

        client1.sendMessage("Hi from 1");
        client2.sendMessage("Bye from 2");
        client3.sendMessage("Hi from 3");
        client4.sendMessage("Bye from 4");

        System.out.println("Client 1 messages");
        System.out.println("-----------------");
        client1.printMessageList();
        System.out.println("-----------------");
        System.out.println("Client 2 messages");
        System.out.println("-----------------");
        client2.printMessageList();
        System.out.println("-----------------");
        System.out.println("Client 3 messages");
        System.out.println("-----------------");
        client3.printMessageList();
        System.out.println("-----------------");
        System.out.println("Client 4 messages");
        System.out.println("-----------------");
        client4.printMessageList();
        System.out.println("-----------------");
    }
}
