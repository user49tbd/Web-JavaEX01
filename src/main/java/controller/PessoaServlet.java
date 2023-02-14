package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pessoa;

/**
 * Servlet implementation class PessoaServlet
 */
@WebServlet("/pessoa")
public class PessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PessoaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		/*
		Map<String,String[]> pm = request.getParameterMap();
		Set<String> spm = pm.keySet();
		for(String k: spm) {
			String[] param = pm.get(k);
			System.out.println(param[0]);
		}
		*/
		
		String idParam = request.getParameter("id");
		String nomeParam = request.getParameter("nome");
		Pessoa p = new Pessoa();
		p.setId(Integer.parseInt(idParam));
		p.setNome(nomeParam);
		
		
		//System.out.println(p);
		
		List<Pessoa> lp = new ArrayList();
		Pessoa p1 = new Pessoa();
		p1.setId(11);
		p1.setNome("BERRY");
		lp.add(p1);
		
		Pessoa p2 = new Pessoa();
		p2.setId(45);
		p2.setNome("ERIC");
		lp.add(p2);
		
		/*
		for(Pessoa ps : lp) {
			System.out.println(ps);
		}
		*/
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("pessoa", p);
		request.setAttribute("pessoas", lp);
		rd.forward(request, response);
	}

}
