import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class modlogin {


    Statement statement;


    public int getCountForSignIn(String username, String password){
        int count = 0;
        try {
            String query = "SELECT COUNT(*) as count FROM accounts " +
                    "WHERE Username = '" + username + "' AND Password = '" + password + "'";
            statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next())
                count = resultSet.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return count;
    }


    public int checkAlreadyAccount(String username){
        int count = 0;
        try {
            String query = "SELECT COUNT(*) as count FROM accounts " +
                    "WHERE Username = '" + username + "'";
            statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next())
                count = resultSet.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return count;
    }


    public int insertAccount(String username, String password){
        int count = 0;
        try {
            if (checkAlreadyAccount(username) == 0){
                String query = "INSERT INTO accounts VALUES" +
                        "('" + username + "','" + password + "')";
                statement = (Statement) Koneksi.getConnection().createStatement();
                statement.executeUpdate(query);
                count = 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return count;
    }
}
