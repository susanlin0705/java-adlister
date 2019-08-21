import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet ("/count")
public class CountServlet extends HttpServlet {
    private int hitCount;

    public void start(){
        hitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String reset = req.getParameter("reset");
        PrintWriter out= resp.getWriter();

        if(reset!=null && reset.equalsIgnoreCase("true")) {
            hitCount = 0;
            out.println(reset);
        }

        hitCount++;

        String content = "<h1> You have hit <h1>" + hitCount + " times";
        out.println(content);
    }
}
