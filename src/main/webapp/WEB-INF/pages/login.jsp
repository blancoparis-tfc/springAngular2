<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<c:url value="/" var="contexto" />
<c:url value="/login" var="loginUrl"/>
<head>
	<link href="${contexto}resources/bootstrap/css/bootstrap.min.css"	rel="stylesheet">
	<link href="${contexto}resources/bootstrap/css/bootstrap-theme.min.css"	rel="stylesheet">
	<link href="${contexto}resources/css/login.css"	rel="stylesheet">
</head>
<body>

    <div class="container">
<form action="${loginUrl}" method="post" class="form-signin">   
	<h2 class="form-signin-heading">Login</h2>    

		<label for="username">Usuario</label>
		<input type="text" id="username" name="username" class="form-control"/>	

		<label for="password">Contraseña</label>
		<input type="password" id="password" name="password" class="form-control"/>	

	<input type="hidden"                        
		name="${_csrf.parameterName}"
		value="${_csrf.token}"/>
	<button type="submit" class="btn btn-lg btn-primary btn-block">Conectarse</button>
</div>
</form>