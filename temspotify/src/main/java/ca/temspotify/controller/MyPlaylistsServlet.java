package ca.temspotify.controller;

import java.io.IOException;

import ca.temspotify.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyPlaylistsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyPlaylistsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paginaRetorno;
		Usuario usuario = (Usuario) request.getSession().getAttribute("Usuario");
		if (usuario == null) {
			paginaRetorno = "/index.html";
		} else {
			paginaRetorno = "/myplaylists.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaRetorno);
		dispatcher.forward(request, response);
	}
}