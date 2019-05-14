package Servlets.Filter;

import Cathedra.Contr.DatabaseHandler;
import Cathedra.Model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

import static java.util.Objects.nonNull;


//@WebFilter(urlPatterns = { "/AuthFilter" })
public class  AuthFilter implements javax.servlet.Filter {

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

        DatabaseHandler auth = new DatabaseHandler();
//        final DatabaseHandler auth=(DatabaseHandler) request.getServletContext().getAttribute("");

        final HttpSession session = request.getSession();

        if ((login != null) && (password !=null)){

        if (nonNull(session) &&
                nonNull(session.getAttribute("login")) &&
                nonNull(session.getAttribute("password"))) {

            final User.ROLE role = (User.ROLE) session.getAttribute("role");

            moveToMenu(request, response, role);

        } else {
            try {
                System.out.println("проверка на существование юзера"+auth.CheckLoginName(new User(login, password)));
               if ( auth.CheckLoginName(new User(login, password)) ){
                        System.out.println("узнает роль");
                        final User.ROLE role = auth.getRoleByLoginPassword(new User(login, password));
                        request.getSession().setAttribute("password", password);
                        request.getSession().setAttribute("login", login);
                        request.getSession().setAttribute("role", role);
                        System.out.println(role);
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
        else {
            req.getRequestDispatcher("/View_auth/Authorization.jsp").forward(request, response);
        }
    }
    private void moveToMenu(final HttpServletRequest req,
                            final HttpServletResponse res,
                            final User.ROLE role)
            throws ServletException, IOException {


        if (role.equals(User.ROLE.ADMIN)) {

            req.getRequestDispatcher("/View_auth/admin_menu.jsp").forward(req, res);

        } else if (role.equals(User.ROLE.USER)) {

            req.getRequestDispatcher("/View_auth/user_menu.jsp").forward(req, res);

        } else {

            req.getRequestDispatcher("/View_auth/Authorization.jsp").forward(req, res);
        }
    }

    @Override
    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
