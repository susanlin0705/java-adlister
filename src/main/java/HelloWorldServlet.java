import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("it's working");
        res.setStatus(333);
        try {
            res.getWriter().println("\n"+"Hello World!"+"\n" );
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
//        super.doPost(req, resp);
        System.out.println("does it work?");
        try {
            resp.getWriter().println("will this line show on the page?");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
