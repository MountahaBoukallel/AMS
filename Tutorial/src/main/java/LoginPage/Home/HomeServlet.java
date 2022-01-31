package LoginPage.Home;

import LoginPage.CommandServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/HomeServlet")
public class HomeServlet extends CommandServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // check if the user is logged in?
        validate(request, response);

        request.setAttribute("Home",/*the html class*/ "active");

        request.getRequestDispatcher("link to the home page").forward(request,response);
    }

}
