package example.javaee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld")
@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet {

	private static final String viewJsp = "/WEB-INF/views/view.jsp";
	private static final String confJsp = "/WEB-INF/views/conf.jsp";

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("message", "Hello World As Request Attribute");

		RequestDispatcher dispatcher;

		if (null != request.getParameter("conf")) {
			dispatcher = getServletContext().getRequestDispatcher(confJsp);
		} else {
			dispatcher = getServletContext().getRequestDispatcher(viewJsp);
		}

		dispatcher.forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		super.doPost(request, response);
	}
}
