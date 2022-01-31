package LoginPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserManagmentServlet", value = "/UserManagmentServlet")
public class UserManagmentServlet extends CommandServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // check if the user is logged in the system
        validate(request,response);
// get the action from the
        String action = request.getParameter("action");

        try{
            Connection connection = bdDAO.getConnection();

            if (action.equals("list")){
                List<UserDAO> list = UserBusiness.getUserList(connection);
                String message = "no data";

                if (list.size() > 0){
                    // to display how many records are in the database
                    message = list.size() + (list.size() > 1 ? "records" : "record");
                }
                //
                request.setAttribute("Message", message);
                // message displayed in the header area
                request.setAttribute(" Cation", "List of Users");
                //
                request.setAttribute("list",list);
                //
                request.setAttribute("User_management",/*the html class*/ "active");

                // return to the page
                request.getRequestDispatcher("link to the admin page").forward(request,response);


            }

        } catch (Exception e){
            request.setAttribute("Error","System error: " + e.getMessage());
            request.getRequestDispatcher("link to the 404 page").forward(request,response);

        }

    }

}
