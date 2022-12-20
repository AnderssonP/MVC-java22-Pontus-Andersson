package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginBean;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String user = request.getParameter("user");
		String password = request.getParameter("password");
		
		String uAdmin = "Admin";
		String pAdmin = "Admin";
		
		String uPontus = "Pontus";
		String pPontus = "Pontus";
		
		if(user.equals(uAdmin) && password.equals(pAdmin)) {
			String loginAccount = request.getParameter("user");
			LoginBean loginBean = new LoginBean();
			loginBean.setUser(loginAccount);
			loginBean.setPassword(loginAccount);
			request.setAttribute("LoginBean", loginBean);
			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
			rd.forward(request, response);
		}else if(user.equals(uPontus) && password.equals(pPontus)) {
			String loginAccount = request.getParameter("user");
			LoginBean loginBean = new LoginBean();
			loginBean.setUser(loginAccount);
			loginBean.setPassword(loginAccount);
			request.setAttribute("LoginBean", loginBean);
			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
