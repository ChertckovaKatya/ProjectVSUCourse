package servlets.serv;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogoutServlet")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();

        session.removeAttribute("password");
        session.removeAttribute("login");
        session.removeAttribute("role");
        request.getSession().setAttribute("password", null);
        request.getSession().setAttribute("login", null);
        request.getSession().setAttribute("role", null);
        request.setAttribute("result","");
        session.invalidate();
        response.sendRedirect("/index.jsp");
    }
}
