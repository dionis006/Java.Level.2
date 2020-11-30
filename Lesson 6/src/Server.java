import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private DataInputStream in;
    private DataOutputStream out;

    public Server() {
        Scanner scanner = new Scanner(System.in);
        try {
            serverSocket = new ServerSocket(8888);
            clientSocket = serverSocket.accept();
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread t1 = new Thread(() -> {
            try {
                while (true) {
                    String incomingMessage = in.readUTF();
                    System.out.println("Message: " + incomingMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Write your message...");
                    out.writeUTF(scanner.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        t2.start();
    }
}
