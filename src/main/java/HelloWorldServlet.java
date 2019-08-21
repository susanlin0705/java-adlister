import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (name != null) {
            String world = "<h1>Hello " + name + "!</h1>";
            out.println(world);
        } else {
            String message = "<h1>Hello World !</h1>";
            out.println(message);
        }

    }


    //@WebServlet("/hello")
//public class HelloWorldServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        System.out.println("it's working");
//
//        String name = req.getParameter("name");
////        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
////        String message= "<h1> Hello World!</h1>";
////        out.println(message);
//
//        if(name!=null){
//            String word = "<h1>Hello "+ name +" !</h1>";
//            out.println(word);
//        }else{
//            String message= "<h1> Hello World!</h1>";
//            out.println(message);
//        }
//
//
//    }
//
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
//        super.doPost(req, resp);
        System.out.println("does it work?");
        try {
            resp.getWriter().println("will this line show on the page?");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}