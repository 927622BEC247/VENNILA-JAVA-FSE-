import java.net.*;
import java.io.*;

public class q35 {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello from server");
        System.out.println("Client says: " + in.readLine());
        server.close();
    }
}