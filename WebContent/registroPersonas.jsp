<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registro de Personas</h1>
	<br></br>
	<form action="personas" method="post">
		<table>
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="nombre"></td>
			</tr>
						<tr>
				<td>Apellidos</td>
				<td><input type="text" name="apellidos"></td>
			</tr>
						<tr>
				<td>Correo</td>
				<td><input type="text" name="correo"></td>
			</tr>
		</table>
		<br></br>
	<button type="submit"">Guardar Persona</button>
	</form>
	<tr></tr>
	<a href="personas">Listar Personas</a>


</body>
</html>