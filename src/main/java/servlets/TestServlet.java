package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

//IOStream
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//Servlet3.0 specific annotations 
import javax.servlet.annotation.WebServlet;



@WebServlet(description = "TestServlet Description", urlPatterns = { "/TestServlet" })

public class TestServlet extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           PrintWriter out=response.getWriter();
           out.println("<html><head><body><center>");
		   out.println("<h2>[TestServlet]Hello World!!! , Date/Time: "+ new java.util.Date()+"<h2>");
		   for (int i =0;i<15;i++) {
			      try {Thread.sleep(2000); 
			        System.out.println("i = "+i);
			       }
                  catch (Exception e) { e.printStackTrace();}
			  }

           out.println("</center></body></html>");

        }


  }
