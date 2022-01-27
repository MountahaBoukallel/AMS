package LoginPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBusiness {
    public static  UserDAO login (Connection connection, String username, String password) throws SQLException {
        String sql = "select username, password,email, display_name from user where username = ? and password =?";
        PreparedStatement statement = connection.prepareStatement(sql);

        int index =1;
        statement.setString(index++,username);
        statement.setString(index++, password);

        ResultSet result = statement.executeQuery();

        if (result.next()){
            UserDAO user = new UserDAO();
            user.setUsername(result.getString("username"));
            user.setPassword(result.getString("password"));
            user.setDisplayName(result.getString("display_name"));
            return user;
        }
        return null;

    }
}
