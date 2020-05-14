package lesson2.Task2;

public class MyServer {

    private final int port;
    private final List<ClientHandler> clients;
    private final AuthService authService;

    public MyServer(int port) {
        this.port = port;
        this.clients = new ArrayList<>();
        this.authService = new BaseAuthService();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is running");
            authService.start();
            Database.connect();
            Database.createTable();

            /*            Database.deleteTable();*/

            while (true) {
                System.out.println("Waiting for client connection...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client has been connected");
                ClientHandler handler = new ClientHandler(clientSocket, this);
                try {
                    handler.handle();
                } catch (IOException e) {
                    System.err.println("Failed to handle client connection!");
                    clientSocket.close();
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            authService.stop();
        }
    }

    public synchronized void subscribe(ClientHandler clientHandler) throws IOException {
        clients.add(clientHandler);
        String msg = "Пользователь авторизовался";
        Database.addLog(clientHandler.getNickname(), String.valueOf(new Timestamp(System.currentTimeMillis())),msg, (String.valueOf(port)));
    }
}