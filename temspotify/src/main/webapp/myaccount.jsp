<!DOCTYPE html>
<jsp:useBean id="Usuario" type="ca.temspotify.model.Usuario"
	scope="session" />
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>.: TemSpotify - My Account :.</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12" align="center">
				<img src="img/spotify-logo.png" class="rounded mx-auto d-block"
					width="10%">
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<h3 class="text-center">Tem Spotify - Sua playlist na Web!</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<h4 class="text-center">Bem vindo!!! ${Usuario.nome}</h4>
			</div>
		</div>
		<div class="row" id="conteudo">
			<div class="col-m-2">&nbsp;</div>
			<div class="col-md-8">
				<ul class="nav">
					<li class="nav-item ml-md-auto">
						<a class="nav-link" href="#">Nova Playlist</a>
					</li>
					<li class="nav-item ml-md-auto">
						<a class="nav-link" href="myplaylists">Minhas Playlists</a>
					</li>
					<li class="nav-item ml-md-auto">
						<a class="nav-link" href="#">Upload Música</a>
					</li>
				</ul>
			</div>
			<div class="col-md-2"> 
				&nbsp;
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>