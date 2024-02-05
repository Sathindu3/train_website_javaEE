package packageOne;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class homeClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
     
    public homeClass() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = null;	
		
		try {
			out=response.getWriter();
			int n = Integer.parseInt(request.getParameter("txt"));
			out.println("<center>");
			if(n%2==0)
				out.println(n+ "is even");
			else
				out.println(n+ "odd");
		}
		catch (Exception e) {
			out.println("error"+e.getMessage());
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
