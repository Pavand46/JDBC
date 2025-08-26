import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        try (Connection con = DBConfig.getConnection();
             Statement st = con.createStatement()) {

            String deleteQuery = "DELETE FROM students WHERE id = 6";
            int rows = st.executeUpdate(deleteQuery);

            System.out.println(rows + " row(s) deleted.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
