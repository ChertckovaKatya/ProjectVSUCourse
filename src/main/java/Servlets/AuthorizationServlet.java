package Servlets;

import Cathedral.Auth;
import Cathedral.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Servlets.AuthorizationServlet")

public class AuthorizationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("login");
        String password = request.getParameter("password");
        User user = new User(name, password);
        Auth auth = Auth.getInstance();

        Boolean result = null;
        try {
            result = auth.CheckLoginName(user);
            request.setAttribute("userName",result);
            doGet(request, response);
        }
        catch (NullPointerException e){
            e.getMessage();
        }




    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/View/Authorization.jsp");
        requestDispatcher.forward(request, response);

    }
}
