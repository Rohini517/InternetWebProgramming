import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/serv1")
public class serv1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String uname = req.getParameter("uname");	
		String upass = req.getParameter("upass");
		Cookie c1 = new Cookie("UserName",uname);
		Cookie c2 = new Cookie("Password",upass);
		res.addCookie(c1);
		res.addCookie(c2);
		PrintWriter out = res.getWriter();
		out.println("<a href='serv2'>Cookie value</a>");
		
	}

}
