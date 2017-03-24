<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Partitio Login Form</title>



<link href="<c:url value="/resources/CSS/Login.css" />" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
	integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ"
	crossorigin="anonymous">



</head>

<body>

	<div class="container">

		<div class="row align-middle">
			<div class="col-md-7 text-white text-center my-auto ">

				<div class="h1" style="text-shadow: 0 0 2px #fff;">Des instants brillants à partager</div>
			</div>

			<div class="col-md-5">
				<div class="card ">
					<div class="card-header">
						<div class="h4 text-center">Bienvenu sur PartitioNetwork</div>
					</div>
					<div class="card-body p-5" style="background-color: white;">
						<form action="<c:url value='j_spring_security_check' />"
							method='POST'>
							<c:if test="${not empty error}">
								<div class="error" style="color: red;">${error}</div>
							</c:if>

							<c:if test="${not empty msg}">
								<div class="msg">${msg}</div>
							</c:if>
							<div class="form-group">

								<input type="text" name="username" class="form-control input-lg"
									placeholder="Username" />
							</div>

							<div class="form-group">
								<input type="password" name="password"
									class="form-control input-lg" placeholder="Password" />
							</div>

							<div class="form-group">
								<input type="submit" class="btn btn-block btn-lg btn-primary"
									value="Login" /> <input type="checkbox"
									name="_spring_security_remember_me" value="1"> Remember
								me
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>


