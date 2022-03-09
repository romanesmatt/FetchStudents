import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import org.relique.jdbc.csv.CsvDriver;

public class FetchStudents {

    /**
     * Fetches the given
     */
    public static void fetchData(String sql) throws SQLException {
        String url = "jdbc:relique:csv:src/data" +
                "?separator=," +
                "&fileExtension=.csv";

        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        boolean append = true;
        CsvDriver.writeToCsv(resultSet, System.out, append);

    }

    /**
     * Fetches all student records.
     *
     * @throws SQLException
     */
    public static void fetchAll() throws SQLException {
        fetchData("SELECT * FROM students");
    }

    /**
     * Fetches student records by their respective ID.]
     *
     * @param id
     */
    public static void fetchById(int id) throws SQLException {
        fetchData("SELECT * FROM students WHERE ID='" + id + "'");

    }

    /**
     * Fetches student records by their respective degree and
     * major.
     *
     * @param degree
     * @param major
     */
    public static void fetchByDegreeAndMajor(String degree, String major) throws SQLException{
        fetchData("SELECT * FROM students WHERE DEGREE='" + degree + "'AND MAJOR='" + major + "'");

    }

    public static void main(String[] args) throws SQLException {
        System.out.println("Fetching all student records...");
        fetchAll();
        System.out.println("All Student records fetched.");

        System.out.println("===============================");

        System.out.println("Fetching student record based on given ID...");
        fetchById(3);
        System.out.println("All relevant student records fetched.");

        System.out.println("===============================");

        System.out.println("Fetching student record based on given ID...");
        fetchByDegreeAndMajor("BSc", "CS");
        System.out.println("All relevant student records fetched.");


    }
}
