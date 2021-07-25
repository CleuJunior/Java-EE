package br.com.alura.grenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novas empresas");
		PrintWriter out = response.getWriter();
		String nomeEmpresa = request.getParameter("nome");

	    String paramDataEmpresa = request.getParameter("data");
	    
	    Date dataAbertura = null;

	    try {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        dataAbertura = sdf.parse(paramDataEmpresa);
	    } catch (ParseException e) {
	        throw new ServletException(e);
	    }
		
	    Empresa empresa = new Empresa();
	    empresa.setNome(nomeEmpresa);
	    empresa.setDataAbertura(dataAbertura);
	    
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		
		request.setAttribute("empresa", empresa.getNome());
		response.sendRedirect("listaEmpresas");

		//chamar JPS
		//RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
		//request.setAttribute("empresa", empresa.getNome());
		//rd.forward(request, response);
	}
}
