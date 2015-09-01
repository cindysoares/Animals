<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.animals.Dog" %>
<%@ page import="br.com.animals.Animal" %>
<title>Animals</title>
</head>
<body>
	<%
		Collection<Animal> animals = (Collection<Animal>) request.getAttribute("animals");
		if (animals==null) {
			animals = new ArrayList<Animal>(0);
		}
	%>

	<table align="center">
		<tr style="padding: 5px;"><td><h3><b>New Dog</b></h3></td><td><h3><b>List of animals</b></h3></td></tr>
		<tr><td align="right" valign="top" style="padding-right: 20px;">			
			<form action="animals" method="post">
				<table>
					<tr><td align="right">Breed : </td><td><input type="text" name="breed" required></td></tr>
					<tr><td align="right">Age: </td><td><input type="number" name="age" required></td></tr>					
				</table>
				<input type="submit" title="Add" />
			</form>
		</td>
		<td valign="top">
			<table border="1px">
				<tr><td></td><td><b>Breed</b></td><td><b>Age</b></td></tr>
			<% 	for(Animal animal: animals) { %>
				<tr><td><%=animal.getClass().getSimpleName() %></td>
			<%		if(animal instanceof Dog) {	
						Dog dog = (Dog) animal; 
			%>									
					<td><%=dog.getBreed() %></td>					
			<%		} else { %>
					<td>-</td>
			<%		} %>
					<td><%=animal.getAge() %></td></tr>
			<%	} %>
			</table>
		</td></tr>
 	</table>
 	
</body>
</html>