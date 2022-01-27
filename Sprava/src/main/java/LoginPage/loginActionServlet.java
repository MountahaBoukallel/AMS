package LoginPage;

import LoginPage.Security.Crypto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "loginActionServlet", value = "/loginActionServlet")
public class loginActionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        password = Crypto.encode(password);

        try {
            Connection connection = bdDAO.getConnection();
            UserDAO user = UserBusiness.login(connection, email, password);

            if (user != null){
                /*
                request.getSession().getAttribute("CURRENT_USER",user);*/
                connection.close();

                request.getRequestDispatcher("/*the path for the next page*/").forward(request, response);
            }else{
                request.setAttribute("err", "Wrong email or password ");
            }
        }catch (Exception e){
            request.setAttribute("err", "System error:" + e.getMessage());
            request.getRequestDispatcher("/login.jsp");
            return;

        }
    }
}
