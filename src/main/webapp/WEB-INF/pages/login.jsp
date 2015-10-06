<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<c:url value="/login" var="loginUrl"/>
<form action="${loginUrl}" method="post">       
	<p>
		<label for="username">Usuario</label>
		<input type="text" id="username" name="username"/>	
	</p>
	<p>
		<label for="password">Contraseña</label>
		<input type="password" id="password" name="password"/>	
	</p>
	<input type="hidden"                        
		name="${_csrf.parameterName}"
		value="${_csrf.token}"/>
	<button type="submit" class="btn">Conectarse</button>
</form>