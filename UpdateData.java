import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        try (Connection con = DBConfig.getConnection();
             Statement st = con.createStatement()) {

            String updateQuery = "UPDATE students SET name = 'Ria' WHERE id = 1";
            int rows = st.executeUpdate(updateQuery);

            System.out.println(rows + " row(s) updated.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
