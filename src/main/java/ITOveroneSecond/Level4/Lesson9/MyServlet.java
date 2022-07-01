package ITOveroneSecond.Level4.Lesson9;

import ITOveroneSecond.Level4.Lesson8.model.City;
import ITOveroneSecond.Level4.Lesson8.repository.CityRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/hello")
public class MyServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        CityRepository cityRepository = new CityRepository();
        List<City> cities = cityRepository.getALL();
        request.setAttribute("cities", cities);
        System.out.println(cities);

        request.getRequestDispatcher("default.jsp").
                forward(request, response);

//        response.setContentType("text/html; charset= UTF-8");
//        PrintWriter out = response.getWriter();
//        out.println("Hello from MyServlet, Привет");
//        out.close();
    }
}
