import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Ads listOfAdds = DaoFactory.getAdsDao();
        List<Ad> lists = listOfAdds.all();

//        List<Ad> lists= DaoFactory.getAdsDao().all();

        req.setAttribute("adslist",lists);
        req.getRequestDispatcher("/ads/index.jsp").forward(req,resp);



    }
}
