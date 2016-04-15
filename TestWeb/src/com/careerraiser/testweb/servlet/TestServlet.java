package com.careerraiser.testweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside get method");
		HttpSession session=request.getSession();
		String name=request.getParameter("name");
		System.out.println(name);
		System.out.println(request.getContextPath());
		System.out.println(request.getQueryString());
		System.out.println(request.getRemoteAddr());
		/*response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("<meta charset=\"UTF-8\">");
		response.getWriter().write("<title>Insert title here</title>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		response.getWriter().write("<h1>Index page</h1>");
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");*/
	//	response.getWriter().write("success");
		session.setAttribute("mycontent", "myvalue");
		System.out.println(session.getAttribute("test"));
		String abcd = session.getAttribute("test") + "abcd";
		session.setAttribute("test", abcd);
		request.getRequestDispatcher("NewFile.jsp").forward(request, response);
	//	doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside post method");
	}

}
