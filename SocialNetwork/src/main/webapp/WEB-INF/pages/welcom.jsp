<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Profil de ${userCn}</title>
<link rel="shortcut icon"
	href="http://www.partitio.com/wp-content/uploads/2016/03/favicon-partitio.png">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
	integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ"
	crossorigin="anonymous">

<link href="<c:url value="/resources/CSS/welcom.css" />"
	rel="stylesheet">


</head>
<body>
<!-- ************************navbar-debut -->
	<nav class="navbar boxShadow fixed-top navbar-inverse  navbar-toggleable-md navBarWhiteBorder navBar">


	<div class="collapse navbar-collapse mx-auto"
		id="navbarSupportedContent">
		<a class="navbar-brand mx-auto fontSize25" href="#"><span
			id="mes"> </span><span>${userCn}</span></a>

		<ul class="navbar-nav mx-auto">
			<li class="nav-item"><a class="nav-link active" href="#"> <i
					class="fa fa-home" style="font-size: 25px;" aria-hidden="true">
				</i> Home
			</a></li>
			<li class="nav-item "><a class="nav-link" href="#"><i
					class="fa fa-user fontSize25" aria-hidden="true"></i>
					Profile</a></li>
			<li class="nav-item "><a class="nav-link" href="#"><i
					class="fa fa-comments-o" style="font-size: 25px;"
					aria-hidden="true"></i> Message</a></li>
			<li class="nav-item "><a class="nav-link"
				href="<c:url value="/j_spring_security_logout" />"><i
					class="fa fa-sign-out fontSize25" aria-hidden="true"></i>
					Déconnexion</a></li>
			<li class="nav-item"><a class="nav-link" href="#"> <i
					class="fa fa-paperclip fontSize25" aria-hidden="true"></i>

			</a></li>
		</ul>

		<form class="form-inline mx-auto ">
			<div class="input-group">
				<input class="form-control" type="text" placeholder="Search">
				<span class="input-group-addon" id="basic-addon1"><i
					class="fa fa-search" aria-hidden="true"></i></span>
			</div>
		</form>


	</div>



	</nav>
<!-- ************************navbar-fin -->

<!-- ************************partie-gauche-debut -->
	<div class="container-fluid cont">

		<div class="row">

			<div class="col-md-2 col-xl-2 nopadding ">
				<div class="card  boxShadow">
					<div class="card-header bagroundColorff766c">
						<img class="img-thumbnail"
							src="<c:url value="/resources/images/brad-pitt.jpg" />"
							class="img-fluid" alt="Responsive image">
					</div>

					<div class="btn-group border-0 btn-group-vertical" role="group"
						aria-label="First group">
						<button type="button"
							class="btn btn-lg btn-secondary fontMenu text-left active border-0">
							<i class="fa fa-user" aria-hidden="true"></i> Profile
						</button>
						<button type="button"
							class="btn btn-lg btn-secondary fontMenu text-left border-0">
							<i class="fa fa-info-circle" aria-hidden="true"></i> A propos
						</button>
						<button type="button"
							class="btn btn-lg btn-secondary fontMenu text-left border-0">
							<i class="fa fa-users" aria-hidden="true"></i> Amis
						</button>
						<button type="button"
							class="btn btn-lg btn-secondary fontMenu text-left border-0">
							<i class="fa fa-pencil-square-o" aria-hidden="true"></i> Editer
							profile
						</button>
					</div>


				</div>
				<br>

				<div class="card boxShadow">
					<div class="card-header fontMenu cardHeaderWhiteBorder">Les
						nouveaux</div>
					<div class="card-block nopadding">
						<img width=60px height=60px
							src="<c:url value="/resources/images/brad-pitt.jpg" />"
							class="img-fluid img-thumbnail" alt="Responsive image"> <span
							class="h6"> <a href="#" class="post-user-name">Samir
								Boumaza</a></span> <img width=60px height=60px
							src="<c:url value="/resources/images/brad-pitt.jpg" />"
							class="img-fluid img-thumbnail" alt="Responsive image"> <span
							class="h6"> <a href="#" class="post-user-name">Samir
								Boumaza</a></span>
					</div>
					<br>
				</div>

			</div>
			<!-- ************************partie-gauche-fin -->
			<!-- ************************partie-centre-debut -->
			<div class="col-md-7 col-xl-7">

				<div class="card boxShadow">

					<div class="card-block nopadding">
						<form>

							<textarea style="resize: none;"  onkeyup="textAreaAdjust(this)"
								placeholder="Dis nous tout" rows="2"
								class="form-control input-lg p-text-area border-0"></textarea>

						</form>
					</div>
					<div class="card-footer bagroundColorf5f5f5">
						<div class="panel-footer">

							<button class="btn btn-danger pull-right">Post</button>

							<ul class="nav justify-content-left">

								<li class="nav-item"><a class="nav-link" href="#"><i
										class="fa fa-map-marker"></i></a></li>

								<li class="nav-item"><a class="nav-link" href="#"><i
										class="fa fa-camera"></i></a></li>

								<li class="nav-item"><a class="nav-link" href="#"><i
										class=" fa fa-film"></i></a></li>

								<li class="nav-item"><a class="nav-link" href="#"><i
										class="fa fa-microphone"></i></a></li>

							</ul>

						</div>
					</div>
				</div>
				<br>
				<div class="card boxShadow">
					<div class="card-header border-bottom-0  cardHeaderWhite">

						<img width=60px height=60px
							src="<c:url value="/resources/images/brad-pitt.jpg" />"
							class="img-fluid img-thumbnail" alt="Responsive image"> <span
							class="h6"> <a href="#" class="post-user-name">Samir
								Boumaza</a>

						</span> <span class="fontMenu">1 minute ago</span>

					</div>

					<div class="card-block nopadding ">

						<p class="postCont">Le Lorem
							Ipsum est simplement du faux texte employé dans la composition et
							la mise en page avant impression. Le Lorem Ipsum est le faux
							texte standard de l'imprimerie depuis les années 1500, quand un
							peintre anonyme assembla ensemble des morceaux de texte pour
							réaliser un livre spécimen de polices de texte. Il n'a pas fait
							que survivre cinq siècles, mais s'est aussi adapté à la
							bureautique informatique, sans que son contenu n'en soit modifié.
							Il a été popularisé dans les années 1960 grâce à la vente de
							feuilles Letraset contenant des passages du Lorem Ipsum, et, plus
							récemment, par son inclusion dans des applications de mise en
							page de texte, comme Aldus PageMaker.</p>

						<input type="text"
							class="form-control rounded-0 border-right-0  border-left-0"
							placeholder="Ajouter un commentaire"
							aria-describedby="basic-addon1">
						<div class="card-block card-header ">totototot</div>
					</div>
				</div>
				<br>
				<div class="text-center">
					<button class="btn  btn-lg btn-danger">
						<i class="fa fa-refresh"></i> Load more
					</button>
				</div>
				<br>
			</div>
	<!-- ************************partie-centre-fin -->
	<!-- ************************partie-droit-debut -->
			<div class="col-md-3 col-xl-3 nopadding ">
				<div class="card boxShadow">
					<div class="card-header  fontMenu cardHeaderWhiteBorder">Les
						infos à la une</div>
					<div class="card-block nopadding">
						<ul class="nav flex-column pull-left new rounded-0 ">

							<li class="nav-item"><a class="nav-link new" href="#"><span
									class="badge badge-pill badge-info"><i
										class="fa fa-info-circle" aria-hidden="true"></i> Info</span>
									Veuillez prendre connaissance de la modification </a></li>
							<li class="nav-item"><a class="nav-link new" href="#"><span
									class="badge badge-pill badge-success"><i
										class="fa fa-hand-spock-o" aria-hidden="true"></i> Evt.</span>
									Evenement Think and drink toto toto toto</a></li>
							<li class="nav-item"><a class="nav-link new" href="#"><span
									class="badge badge-pill badge-danger"><i
										class="fa fa-exclamation-triangle" aria-hidden="true"></i>
										Imp.</span> Tout sur le nouveau site web de l'entreprise </a></li>
						</ul>
					</div>
				</div>
				<br>
				<div class="card boxShadow">
					<div class="card-header fontMenu cardHeaderWhiteBorder">Mes
						photos</div>
					<div class="card-block d-flex ">
						<div class="card-columns">
							<a class=" card " href="#"> <img style="margin: 1px;"
								class="img-fluid"
								src="<c:url value="/resources/images/brad-pitt.jpg" />">

							</a> <a class=" card " href="#"> <img class="img-fluid "
								src="<c:url value="/resources/images/brad-pitt.jpg" />">

							</a> <a class="card" href="#"> <img class="img-fluid  "
								src="<c:url value="/resources/images/pont.jpg" />">

							</a> <a class="card" href="#"> <img class="img-fluid  "
								src="<c:url value="/resources/images/brad-pitt.jpg" />">

							</a> <a class="card " href="#"> <img class="img-fluid  "
								src="<c:url value="/resources/images/pont.jpg" />">

							</a> <a class="card " href="#"> <img style="margin: 1px;"
								class="img-fluid "
								src="<c:url value="/resources/images/brad-pitt.jpg" />">

							</a>
						</div>
					</div>

				</div>
			</div>

		</div>
	</div>
	<!-- ************************partie-droit-fin -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"
		integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY"
		crossorigin="anonymous"></script>


	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js"
		integrity="sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB"
		crossorigin="anonymous"></script>

	
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.3/js/bootstrap.min.js"
		integrity="sha384-ux8v3A6CPtOTqOzMKiuo3d/DomGaaClxFYdCu2HPMBEkf6x2xiDyJ7gkXU0MWwaD"
		crossorigin="anonymous"></script>
	<script src="<c:url value="/resources/script/welcom.js" />"></script>
</body>
</html>