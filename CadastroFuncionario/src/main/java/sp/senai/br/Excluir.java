package sp.senai.br;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Excluir
 */
@WebServlet("/Delete")
public class Excluir extends HttpServlet {
	
	protected void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Funcionario> lista = null;
		Funcionario f = new Funcionario();
		String cpf = request.getParameter("cpf");
		
		lista = new ArrayList<>();
		lista.remove(f);
		
		
		f.getCpf();
		lista.add(f); 
		
		
	}

}
