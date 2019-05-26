package servlets.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreatTestServlet")
public class CreatTestServlet extends HttpServlet {
    Integer kol_quest=3;
    Integer i =0;
    Integer[] type = {1,2,3};

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        if (type.equals("first") || type.equals("third")) {
            String answer = request.getParameter("answer");
            System.out.println("answer=" + answer + " , " + "type=" + type);
        }
        if (type.equals("second")){
            String[] answers =  request.getParameterValues("answer");
            System.out.print("answers: ");
            if (answers!=null) {
                for (int i = 0; i < answers.length; i++) {
                    System.out.print(answers[i]);
                }
            }
        }
       i++;
        doGet(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (i<kol_quest) {
            System.out.println(" i= " + i);
            request.setAttribute("id", type[0]);
            request.getRequestDispatcher("/form_test/TestDemonstration.jsp").forward(request, response);
        }
        else {
            request.setAttribute("end","end");
            request.getRequestDispatcher("/form_test/TestDemonstration.jsp").forward(request, response);
        }
    }
}
