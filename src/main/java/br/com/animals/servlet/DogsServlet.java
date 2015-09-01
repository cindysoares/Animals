package br.com.animals.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.animals.Animals;
import br.com.animals.Dog;

@SuppressWarnings("serial")
@WebServlet(name="Dogs", value="/dogs")
public class DogsServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String breed = request.getParameter("breed");
		String age = request.getParameter("age");
		if(breed != null && age != null) {
			Animals.add(new Dog(breed,  Integer.parseInt(age)));
		}
		 
		request.setAttribute("animals", Animals.findAll());
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}
	

}
