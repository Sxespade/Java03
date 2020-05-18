package lesson2.Task2;

public class Database {
//    private static Connection connection;
//    private static Statement stmt;

    public static void connect() {
//        try {
//            connection = DriverManager.getConnection("jdbc:sqlite:chat.db");
//            stmt = connection.createStatement();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void deleteTable() {
//        try {
//            stmt.executeUpdate("DROP TABLE log");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void createTable() {
//        try {
//            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS log ( id INTEGER PRIMARY KEY AUTOINCREMENT," +
//                    "nick TEXT," +
//                    "time TEXT," +
//                    "text TEXT," + "port TEXT)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void addLog(String nick, String time, String text, String port) {
//        try {
//            String query = "INSERT INTO log (nick, time, text, port) VALUES (?, ?, ?, ?);";
//            PreparedStatement ps = connection.prepareStatement(query);
//            ps.setString(1, nick);
//            ps.setString(2, time);
//            ps.setString(3, text);
//            ps.setString(4, port);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void disconnect() {
//        try {
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
