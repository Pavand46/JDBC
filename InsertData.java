import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try (Connection con = DBConfig.getConnection();
             Statement st = con.createStatement()) {

            String insertQuery = "INSERT INTO students VALUES (6, 'Samm', 23)";
            int rows = st.executeUpdate(insertQuery);

            System.out.println(rows + " row(s) inserted.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
