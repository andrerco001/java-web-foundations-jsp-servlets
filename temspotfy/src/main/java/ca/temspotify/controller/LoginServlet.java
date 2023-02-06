package ca.temspotify.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("txtEmail");
		String senha = req.getParameter("txtSenha");
		String pagina;
		
		if(email.equals("jean@jean.ca") && senha.equals("1234")) {
			pagina = "/myaccount.jsp";
		} else {
			req.setAttribute("errorSTR", "Email / Senha não encontrados!");			
			pagina = "/error.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(req, resp);
	}
}