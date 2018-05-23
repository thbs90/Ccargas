package br.com.connectcargas.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.connectcargas.model.Usuario;

@WebServlet("/teste")
public class TesteServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4814318279400221739L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Usuario teste = new Usuario();
		teste.setId(2);
		teste.setNome("Thomás Henrique");
		
		req.setAttribute("dados", teste);
		req.getRequestDispatcher("teste.jsp").forward(req, resp);

	}

}
