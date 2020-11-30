import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket clientSocket;
    private DataInputStream in;
    private DataOutputStream out;

    public Client() {
        Scanner scanner = new Scanner(System.in);
        try {
            clientSocket = new Socket("localhost", 8888);
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Write your message...");
                    out.writeUTF(scanner.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    String incomingMessage = in.readUTF();
                    System.out.println("Message: " + incomingMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
