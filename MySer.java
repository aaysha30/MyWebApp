package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySer extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public MySer() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//we are setting http response
		response.setContentType("text/html");
		//we are connecting the printwriter
		PrintWriter pw=response.getWriter();

		//whatever we print here goes to http response body
		pw.print("<html><body>");
		pw.println("<h1>HTML GENERATE FROM SERVLET</h1>");
		pw.print("</body></html>");
		pw.close();
	}

}
