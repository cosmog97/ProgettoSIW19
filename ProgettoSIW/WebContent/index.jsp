<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
String session_val = (String)session.getAttribute("Username"); 
%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Loggato</title>
</head>
<body>

	Benvenuto su GestioneEventi
	<script type="text/javascript">
		var session_obj= '<%=session_val%>';
		if (session_obj != "null") {
			document.write("Utente loggato: " + session_obj);
			document.write("<a href=\"Logout\">logout</a>");
		}
		else  {
			document.write("<a href=\"login.jsp\">Accedi all' account</a>")
		}
</script>

</body>
</html>