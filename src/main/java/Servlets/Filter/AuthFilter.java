package Servlets.Filter;

import Cathedra.Contr.DatabaseHandler;
import Cathedra.Model.User;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicReference;

import static java.util.Objects.nonNull;

public class  AuthFilter implements javax.servlet.Filter {

    private FilterConfig filterConfig;
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        System.out.println("doFilter");

        final HttpServletRequest request = (HttpServletRequest) req;
        final HttpServletResponse response = (HttpServletResponse) resp;

        final String login = request.getParameter("login");
        final String password = request.getParameter("password");
        System.out.println(login+"  "+password);

        @SuppressWarnings("unchecked")
        final AtomicReference<DatabaseHandler> auth = (AtomicReference< DatabaseHandler>) req.getServletContext().getAttribute("dao");

        //DatabaseHandler auth=(DatabaseHandler) request.getServletContext().getAttribute("db");

        final HttpSession session = request.getSession();

        if (nonNull(session) &&
                nonNull(session.getAttribute("login")) &&
                nonNull(session.getAttribute("password"))) {

            final User.ROLE role = (User.ROLE) session.getAttribute("role");

            moveToMenu(request, response, role);

        } else {
            try {
                //System.out.println(auth.get().CheckLoginName(new User(login, password)));
                if (auth.get().CheckLoginName(new User(login, password)) ){

                    final User.ROLE role = auth.get().getRoleByLoginPassword(new User(login, password));
                    request.getSession().setAttribute("password", password);
                    request.getSession().setAttribute("login", login);
                    request.getSession().setAttribute("role", role);

                    moveToMenu(request, response, role);

                } else {

                    moveToMenu(request, response, User.ROLE.UNKNOWN);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    private void moveToMenu(final HttpServletRequest req,
                            final HttpServletResponse res,
                            final User.ROLE role)
            throws ServletException, IOException {


        if (role.equals(User.ROLE.ADMIN)) {

            req.getRequestDispatcher("/View/View_auth/admin_menu.jsp").forward(req, res);

        } else if (role.equals(User.ROLE.USER)) {

            req.getRequestDispatcher("/View/View_auth/user_menu.jsp").forward(req, res);

        } else {

            req.getRequestDispatcher("/View/View_auth/Authorization.jsp").forward(req, res);
        }
    }

    @Override
    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
