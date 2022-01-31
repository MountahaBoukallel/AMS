package LoginPage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            user.setEmail(result.getString("email"));
            user.setDisplayName(result.getString("display_name"));
            return user;
        }
        return null;

    }
    // Display a list

    public static List<UserDAO> getUserList(Connection connection) throws SQLException {
        String sql = "select username, password, email, display_name from user";

        System.out.println(sql);

        PreparedStatement statement = connection.prepareStatement(sql);



        ResultSet result = statement.executeQuery();

        List<UserDAO> list = new ArrayList<>();
        if (result.next()){
            UserDAO user = new UserDAO();
            user.setUsername(result.getString("username"));
            user.setPassword(result.getString("password"));
            user.setEmail(result.getString("email"));
            user.setDisplayName(result.getString("display_name"));

            list.add(user);
        }
        return list;

    }

    }

