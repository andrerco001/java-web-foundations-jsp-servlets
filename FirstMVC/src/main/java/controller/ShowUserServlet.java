package controller;

import java.io.IOException;

import com.google.gson.Gson;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 * Servlet implementation class ShowUserServlet
 */
public class ShowUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowUserServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pUser = request.getParameter("user");
		String pSenha = request.getParameter("senha");
		String pModo = request.getParameter("modo");

		System.out.println("User  : " + pUser);
		System.out.println("Senha : " + pSenha);
		System.out.println("Modo  : " + pModo);

		String pagina = "/erro.jsp";

		if ("jean".equals(pUser) && "1234".equals(pSenha)) {
			Usuario u = new Usuario();
			u.setId(1010);
			u.setUsername("jean");
			u.setFullname("Jean Jean");
			u.setEmail("jean@jean.ca");
			request.setAttribute("Usuario", u);

			if (pModo.equals("html")) {
				pagina = "/ok.jsp";
			} else {
				Gson gson = new Gson();
				String resultado = gson.toJson(u);
				request.setAttribute("UsuarioJSON", resultado);
				pagina = "/result.jsp";
			}
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}
}