package LoginPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


// check whether the user is logged in the system or not
//Prevent the user to access application resources without logging in to the system using common action. You also can do this by using servlet filter.
@WebServlet(name = "LoginPage.CommandServlet", value = "/LoginPage.CommandServlet")
public class CommandServlet extends HttpServlet {

    protected void validate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // if that user doesn't exist then the session is expired
        if(request.getSession().getAttribute("CURRENT_USER") == null){
            request.setAttribute("err", "You're not logged in the system");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
