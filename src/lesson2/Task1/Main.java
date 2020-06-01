package lesson2.Task1;

import java.sql.*;

public class Main {
    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            connect();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (\n" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "score TEXT)");
            String newValue = "2";
            String id = "1";
            stmt.executeUpdate(String.format("UPDATE students SET score = %s where id = %s", newValue, id));
            stmt.executeUpdate("DELETE FROM students");
            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('John','1')");
            stmt.executeQuery("SELECT * FROM students");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        disconnect();


    }

}
