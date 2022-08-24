package sp.senai.br;

import sp.senai.br.Funcionario;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Cad")
public class Cadastro extends HttpServlet {
	
	
	private HttpSession session;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String cargo = request.getParameter("cargo");
		
		Funcionario f = new Funcionario();
		f.setCargo(cargo);
		f.setCpf(cpf);
		f.setNome(nome);
		
		List<Funcionario> lista = null;
		
		//String SalvoSession = "";
		session = request.getSession();//sessão atual (perguntando em qual sessão está)
		Object obj = session.getAttribute("ListF");//colocao os pinduricalhos no object, através do getAtribute.(Quardando informações)
		
		//String pagina = "";
		
		if (obj==null) {
			System.out.println("Parte 1");
			lista = new ArrayList<>();
			lista.add(f); 
			session.setAttribute("ListF", lista);
			
		}else {
			System.out.println("Parte 2");
			lista = (ArrayList<Funcionario>) obj;
			
			lista.add(f);
			
			 session.setAttribute("ListF", lista);
		}
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");
		
		for (Funcionario func : lista) {
			
			pw.println("<h1>" + func.getNome() +"</h1>");
			pw.println("<h1>" + func.getCpf() +"</h1>");
			pw.println("<h1>" + func.getCargo() +"</h1>");
		
		}
		
		
		pw.println("</html>");
		
		
		
		
		}

}


