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
    private Auth auth;
    Boolean result = null;
    private User user;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Enter doPost");
            String name = request.getParameter("login");
            String password = request.getParameter("password");

            if (name!=null && password!=null) {

                user = new User(name, password);
            }
        auth = Auth.getInstance();




        try {
//            String action = request.getParameter("action");
//            request.setAttribute("auth", auth);

            result = auth.CheckLoginName(user);
            if (result!=null){
                request.getRequestDispatcher("/View/Auth_result.jsp").forward(request, response);

            }
            request.setAttribute("auth", auth);
//            switch (action == null ? "info" : action) {
//                case "submit":
//            if (result) {
//                request.getRequestDispatcher("/View/Auth_result.jsp").forward(request, response);
//            } else {
//                request.getRequestDispatcher("/View/Authorization.jsp").forward(request, response);
//            }
//                    break;
//                case "info":
//                default:
//                    request.getRequestDispatcher("/View/Authorization.jsp").forward(request, response);
//                    break;
//            request.getRequestDispatcher("/View/Authorization.jsp").forward(request, response);
        }


        catch(NullPointerException e)

    {
        e.getMessage();
    }
}


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Enter doGet");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/View/Authorization.jsp");
        requestDispatcher.forward(request, response);

    }
}
