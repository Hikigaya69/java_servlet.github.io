package demo2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myLogin")
public class myLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		String n=req.getParameter("fname");
		String n1=req.getParameter("lname");
		String n2=req.getParameter("usn");
		String n3=req.getParameter("email");
		System.out.println("First Name is: "+n+" Last name is: "+n1+" USN is: "+n2+" Email is: "+n3);		
		PrintWriter out=resp.getWriter();
		out.print("First Name is: "+n+" Last name is: "+n1+" USN is: "+n2+" Email is: "+n3);		
	}

}
