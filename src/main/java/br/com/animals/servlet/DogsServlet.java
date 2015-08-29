package br.com.animals.servlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.animals.Dog;

@SuppressWarnings("serial")
@WebServlet(name = "Dogs", value = "/dogs")
public class DogsServlet extends HttpServlet {
	
	private static final List<Dog> dogs = new ArrayList<Dog>(Arrays.asList(
				new Dog("Border Collie", 10),
				new Dog("Labrador", 2),
				new Dog("Golden Retriever", 7)
			));
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String breed = request.getParameter("breed");
		String age = request.getParameter("age");
		if(breed != null && age != null) {
			dogs.add(new Dog(breed,  Integer.parseInt(age)));
		}
		
		RequestDispatcher rd = null;
 
		request.setAttribute("dogs", dogs);
		rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}
	
}