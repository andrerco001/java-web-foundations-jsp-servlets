package ca.temspotify.controller;

import java.io.IOException;
import java.util.List;

import ca.temspotify.dao.UsuarioDAO;
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

		List<Object> res;
		UsuarioDAO userDAO = new UsuarioDAO();
		res = userDAO.read(null);

		if (email.equals("jean@jean.ca") && senha.equals("1234")) {
			/* simular uma recuperacao do Banco de Dados */
			pagina = "/myaccount.jsp";
			req.getSession().setAttribute("Usuario", res.get(0));
		} else {
			pagina = "/error.jsp";
			req.setAttribute("errorSTR", "Email / Senha não encontrados!");
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(req, resp);
	}
}