<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.animals.Dog" %>
<title>Dogs</title>
</head>
<body>

	<h4><b>New Dog</b></h4>
	<form action="dogs" method="get">
		Breed : <input type="text" name="breed"> <BR>
		Age: <input type="text" name="age"> <BR>
		<input type="submit" title="Add"/>
	</form>
	
	<%
		List<Dog> dogs = (List<Dog>) request.getAttribute("dogs");
		if (dogs==null) {
			dogs = new ArrayList<Dog>(0);
		}
	%>
	
	<h4><b><%=dogs.size() %> dogs in the list: </b></h4>
 
 	
</body>
</html>