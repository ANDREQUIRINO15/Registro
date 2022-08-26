package sp.senai.br;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Excluir
 */
@WebServlet("/Delete")
public class Excluir extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cpf = request.getParameter("cpf");//Pegando o valor de cpf da url atribuindo para Cpf do código 
		
		
		HttpSession session = request.getSession();//pegando as informações da sessão
		
		Object obj = session.getAttribute("ListF");// pegando expecificamente o item ListF
		
	
		List<Funcionario> lista = (ArrayList<Funcionario>) obj;//Confirmando que List é uma lista 
		
		Funcionario f = new Funcionario();
		f.setCpf(cpf);
		
		//lista.remove(f);
		
		session.setAttribute("ListF", lista);
		
		lista.remove(f);
		
	    PrintWriter pw = response.getWriter();
	    //lista.add(cpf);
		
		pw.println("<html><body><form>Cpf:  <input name = 'cpf' type='text'/></input><input type='excluir'></form><h1>" + f.getCpf() + "<h1></body></html>");
		

		
	
	
		
		
	}

}
