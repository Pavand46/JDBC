import java.sql.*;

public class Main {
    public static void main(String[] args) {
        /*
        import packages
        load and register the driver (optional)
        create connection
        create statement
        execute statement
        process the results
        close the resources
         */

        String url = "jdbc:postgresql://localhost:5432/jdbcdemo"; //DB name = jdbcdemo
        String name = "postgres";     //DB username
        String pass = "Password";  //DB password

        try{
            Connection con = DriverManager.getConnection(url, name, pass);
            System.out.println("Connection established");
            Statement st = con.createStatement();
            String readQuery = "select * from students"; // Reading the Data
            ResultSet rs = st.executeQuery(query);

          
           while(rs.next()){
               String sName = rs.getString("name");
               int marks = rs.getInt("marks");
               System.out.println(sName +" scored "+ marks + " marks");
           }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
